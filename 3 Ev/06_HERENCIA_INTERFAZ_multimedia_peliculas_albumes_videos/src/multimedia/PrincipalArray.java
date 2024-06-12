package multimedia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalArray {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayMultimedia miArray = new ArrayMultimedia(10);
        boolean continuar = true;

        /**
         * Manejo de la salida forzada
         */ 
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\nSalida forzada");
        }));

        /**
         * Menu de la aplicación
         */
        while (continuar) {
            try {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Añadir Película");
                System.out.println("2. Añadir Álbum");
                System.out.println("3. Mostrar todos los objetos");
                System.out.println("4. Buscar Película por Título");
                System.out.println("5. Buscar Álbum por Índice");
                System.out.println("6. Borrar Película por Título");
                System.out.println("7. Salir"); 
                
                // Validar entrada del usuario para el menú
                int opcion = -1;
                while (opcion < 1 || opcion > 7) {
                    try {
                        System.out.print(" > Seleccione una opción: ");
                        opcion = scanner.nextInt();
                        if (opcion < 1 || opcion > 7) {
                            System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 7.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número del 1 al 7.");
                        scanner.next(); // Limpiar la entrada no válida
                    }
                }
                scanner.nextLine(); // Consumir el salto de línea


                /**
                 * Opciones del menú
                 */
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el título de la película: ");
                        String tituloP = scanner.nextLine();
                        System.out.print("Ingrese el autor/director de la película: ");
                        String autorP = scanner.nextLine();
                        String formatoP = "DVD"; // Fijo para películas
                        System.out.print("Ingrese la duración de la película en minutos: ");
                        int duracionP = leerEntero(scanner);
                        System.out.print("Ingrese el nombre del actor principal (puede ser nulo): ");
                        String actorPrincipal = scanner.nextLine();
                        if (actorPrincipal.isEmpty()) actorPrincipal = null;
                        System.out.print("Ingrese el nombre de la actriz principal (puede ser nulo): ");
                        String actrizPrincipal = scanner.nextLine();
                        if (actrizPrincipal.isEmpty()) actrizPrincipal = null;
                        System.out.print("¿Es un estreno? (true/false): ");
                        boolean estreno = leerBoolean(scanner);

                        try {
                            Pelicula pelicula = new Pelicula(tituloP, autorP, formatoP, duracionP, actorPrincipal, actrizPrincipal, estreno);
                            if (miArray.añadirObjeto(pelicula)) {
                                System.out.println("Película añadida correctamente.");
                            } else {
                                System.out.println("No se pudo añadir la película. El array está lleno.");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.print("Ingrese el título del álbum: ");
                        String tituloA = scanner.nextLine();
                        System.out.print("Ingrese el autor del álbum: ");
                        String autorA = scanner.nextLine();
                        String formatoA = "CD"; // Fijo para álbumes
                        System.out.print("Ingrese la duración del álbum en minutos: ");
                        int duracionA = leerEntero(scanner);
                        System.out.print("Ingrese el número de canciones: ");
                        int numCanciones = leerEntero(scanner);
                        System.out.print("Ingrese el año de lanzamiento: ");
                        int añoLanzamiento = leerEntero(scanner);

                        Album album = new Album(tituloA, autorA, formatoA, duracionA, numCanciones, añoLanzamiento);
                        if (miArray.añadirObjeto(album)) {
                            System.out.println("Álbum añadido correctamente.");
                        } else {
                            System.out.println("No se pudo añadir el álbum. El array está lleno.");
                        }
                        break;

                    case 3:
                        System.out.println(miArray.toString());
                        break;

                    case 4:
                        System.out.print("Ingrese el título de la película a buscar: ");
                        String tituloBuscar = scanner.nextLine();
                        miArray.buscarPelicula(tituloBuscar);
                        break;

                    case 5:
                        System.out.print("Ingrese el índice del álbum a buscar: ");
                        int indiceBuscar = leerEntero(scanner);
                        Album albumEncontrado = miArray.buscarAlbum(indiceBuscar);
                        if (albumEncontrado != null) {
                            System.out.println(albumEncontrado.toString());
                        } else {
                            System.out.println("No se encontró un álbum en esa posición.");
                        }
                        break;

                    case 6:
                        System.out.print("Ingrese el título de la película a borrar: ");
                        String tituloBorrar = scanner.nextLine();
                        if (miArray.borrarPelicula(tituloBorrar)) {
                            System.out.println("Película borrada.");
                        } else {
                            System.out.println("\nPelícula no encontrada.");
                        }
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    /**
     * Lee un número entero
     * @param scanner
     * @return
     */

    private static int leerEntero(Scanner scanner) {
        int valor = -1;
        while (valor < 0) {
            try {
                valor = scanner.nextInt();
                if (valor < 0) {
                    System.out.println("El valor debe ser un número positivo. Intente de nuevo:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero:");
                scanner.next(); // Limpiar la entrada no válida
            }
        }
        scanner.nextLine(); // Consumir el salto de línea
        return valor;
    }

    /**
     * Lee un boolean
     * @param scanner
     * @return
     */

    private static boolean leerBoolean(Scanner scanner) {
        boolean valor = false;
        boolean validado = false;
        while (!validado) {
            try {
                valor = scanner.nextBoolean();
                validado = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese true o false:");
                scanner.next(); // Limpiar la entrada no válida
            }
        }
        scanner.nextLine(); // Consumir el salto de línea
        return valor;
    }
}
