import java.util.Scanner;
/**
 * Clase para calcular el valor de un seguro.
 */
public class ValorSeguro {
    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        /**
         * Bucle principal del programa.
         */
        do {
            mostrarMenu();
            int opcionElegida = scanner.nextInt();

            switch (opcionElegida) {
                case 1:
                    calcularSeguro(scanner);
                    break;
                case 2:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (!salir);

        scanner.close();
    }

    /**
     * Muestra el menu de opciones.
     */
    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Calcular Seguro");
        System.out.println("2. Salir del Programa");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Calcula el valor de un seguro.
     * @param scanner
     */
    private static void calcularSeguro(Scanner scanner) {
        System.out.print("Ingrese la edad del conductor: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el sexo del conductor (true para mujer, false para hombre): ");
        boolean esMujer = scanner.nextBoolean();

        System.out.print("Ingrese los años sin haber dado parte de accidente: ");
        int aniosSinAccidentes = scanner.nextInt();

        Conductor conductor = new Conductor(edad, esMujer, aniosSinAccidentes);

        System.out.print("Ingrese el tipo de coche (p para pequeño, g para grande, m para mediano): ");
        char tipo = scanner.next().charAt(0);

        // Calculo de la tarifa
        int tarifa = 0;
        switch (tipo) {
            case 'p':
                tarifa = 300;
                break;
            case 'g':
                tarifa = 500;
                break;
            case 'm':
                tarifa = 400;
                break;
            default:
                System.out.println("Tipo de coche no válido.");
                return;
        }

        // Aplicación de descuento
        boolean descuentoAplicado = conductor.aplicarDescuento();
        double descuento = 0.05;

        // Aplicación de descuento
        if (descuentoAplicado) {
            descuento = (tipo == 'p') ? 0.1 : 0.25;
        }

        // Impresión de resultados
        double tarifaFinal = tarifa - (tarifa * descuento);
        System.out.println("\n--- Resultados ---");
        System.out.println("Tarifa sin descuento: " + tarifa);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Tarifa final: " + tarifaFinal);
    }
}
