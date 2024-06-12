package discos_canciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el nombre del disco: "); //solicitamos el nombre del disco
            String nombreDisco = scanner.nextLine(); //leemos el nombre del disco

            System.out.print("Introduce el número de canciones del disco: "); //solicitamos el número de canciones del disco
            int numeroCanciones = scanner.nextInt(); //leemos el número de canciones del disco
            scanner.nextLine();  // Consumir el salto de línea

            Disco disco = new Disco(nombreDisco, numeroCanciones); //creamos un objeto de la clase Disco

            while (true) {
                System.out.println("\nMenú:"); //mostramos el menú
                System.out.println("1. Insertar una canción en el disco"); //mostramos la opción de insertar una canción
                System.out.println("2. Buscar una canción en el disco"); //mostramos la opción de buscar una canción
                System.out.println("3. Visualizar todos los datos del disco"); //mostramos la opción de visualizar los datos del disco
                System.out.println("4. Salir"); //mostramos la opción de salir

                System.out.print("Elige una opción: "); //solicitamos que el usuario elija una opción
                int opcion = scanner.nextInt(); //leemos la opción
                scanner.nextLine(); //leemos el salto de línea

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el título de la canción: "); //solicitamos el título de la canción
                        String titulo = scanner.nextLine(); //leemos el título de la canción

                        System.out.print("Introduce la duración de la canción: "); //solicitamos la duración de la canción
                        double duracion = scanner.nextDouble(); //leemos la duración de la canción
                        scanner.nextLine();   // Consumir el salto de línea

                        System.out.print("Introduce el nombre del cantante: "); //solicitamos el nombre del cantante
                        String cantante = scanner.nextLine(); //leemos el nombre del cantante

                        Cancion nuevaCancion = new Cancion(titulo, duracion); //creamos un objeto de la clase Cancion
                        nuevaCancion.setCantante(cantante); //establecemos el cantante de la canción

                        if (disco.insertar(nuevaCancion)) {
                            System.out.println("Canción insertada con éxito."); //mostramos un mensaje de éxito
                        } else {
                            System.out.println("No hay espacio para más canciones en el disco."); //mostramos un mensaje de error
                        }
                        break;

                    case 2:
                        System.out.print("Introduce el nombre del cantante de la canción a buscar: "); //solicitamos el nombre del cantante de la canción a buscar
                        String nombreCantante = scanner.nextLine(); //leemos el nombre del cantante de la canción a buscar

                        Cancion cancionEncontrada = disco.buscar(nombreCantante); //buscamos la canción por el cantante
                        if (cancionEncontrada != null) {
                            System.out.println("Canción encontrada: " + cancionEncontrada); //mostramos la canción encontrada
                        } else {
                            System.out.println("No se encontró ninguna canción con ese nombre de cantante."); //mostramos un mensaje de error
                        }
                        break;

                    case 3:
                        disco.visualizar();
                        break;

                    case 4:
                        System.out.println("Saliendo del programa. ¡Adiós!"); //mostramos un mensaje de despedida
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo."); //mostramos un mensaje de error
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Por favor, introduce los datos correctamente."); //mostramos un mensaje de error
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); //mostramos un mensaje de error
        } finally {
            scanner.close(); //cerramos el scanner
        }
    }
}
