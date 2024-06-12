import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListPrincipal {
    private static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            do {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea

                switch (opcion) {
                    case 1:
                        crearEmpleado(scanner);
                        break;
                    case 2:
                        mostrarEmpleados();
                        break;
                    case 3:
                        mostrarRangoEdad(scanner);
                        break;
                    case 4:
                        System.out.println("Empleado más antiguo: \n" + buscarMasAntiguo());
                        break;
                    case 5:
                        mostrarOrdenadosPorAñoIncorporacion();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor elige otra vez.");
                }
            } while (opcion != 6);
        } catch (Exception e) {
            System.out.println("Salida de la aplicación.");
        }
    }

    private static void mostrarMenu() {  
        System.out.println("\n---------------------------------");
        System.out.println("    Menú de opciones:");
        System.out.println("    1. Crear empleado");
        System.out.println("    2. Mostrar empleados");
        System.out.println("    3. Mostrar empleados en rango de edad");
        System.out.println("    4. Buscar empleado más antiguo");
        System.out.println("    5. Mostrar empleados ordenados por año de incorporación");
        System.out.println("    6. Salir");
        System.out.println("---------------------------------");
        System.out.print("Elige una opción: ");  
    }

    public static void crearEmpleado(Scanner scanner) {
        try {
            System.out.print("\nTipo de empleado (1- Administrativo, 2- Informático): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            System.out.print("Año de incorporación: ");
            int añoIncorporacion = scanner.nextInt();

            if (tipo == 1) {
                System.out.print("Sueldo mínimo: ");
                double sueldoMin = scanner.nextDouble();
                empleados.add(new Administrativo(nombre, edad, añoIncorporacion, sueldoMin));
            } else if (tipo == 2) {
                System.out.print("Sueldo mínimo: ");
                double sueldoMin = scanner.nextDouble();

                System.out.print("Número de proyectos: ");
                int proyectos = scanner.nextInt();
                empleados.add(new Informatico(nombre, edad, añoIncorporacion, sueldoMin, proyectos)); 
            } else {
                System.out.println("Tipo de empleado no válido");
            }

        } catch (Exception e) {
            System.out.println("\nSalida de la aplicación.");
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }

    public static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la lista.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : empleados) {
                System.out.println(emp);
            }
        }
    }

    public static void mostrarRangoEdad(Scanner scanner) {
        System.out.print("Edad mínima: ");
        int edadMin = scanner.nextInt();
        System.out.print("Edad máxima: ");
        int edadMax = scanner.nextInt();

        System.out.println("Empleados en el rango de edad [" + edadMin + ", " + edadMax + "]:");
        for (Empleado emp : empleados) {
            if (emp.getEdad() >= edadMin && emp.getEdad() <= edadMax) {
                System.out.println(emp);
            }
        }
    }

    public static Empleado buscarMasAntiguo() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la lista.");
            return null;
        }
        
        Empleado masAntiguo = empleados.get(0);
        for (Empleado emp : empleados) {
            if (emp.getAñoIncorporacion() < masAntiguo.getAñoIncorporacion()) {
                masAntiguo = emp;
            }
        }
        return masAntiguo;
    }

    public static void mostrarOrdenadosPorAñoIncorporacion() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en la lista.");
            return;
        }
        
        Collections.sort(empleados, Comparator.comparingInt(Empleado::getAñoIncorporacion));
        System.out.println("Empleados ordenados por año de incorporación:");
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }
}
