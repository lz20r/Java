public class NotasAlumnos {

    public static void main(String[] args) {
        // PRIMERO: Inicializar matriz de notas y arrays de módulos y nombres
        int[][] notasAlumnos = {
            {5, 6, 7, 8, 9, 0, 22}, // SI
            {4, 6, 8, 10, 7, 5, 3}, // LDM
            {3, 4, 5, 6, 7, 8, 9},  // PEJ
            {6, 7, 8, 9, 0, 22, 5}, // EDD
            {5, 6, 7, 8, 9, 10, 11},// FOL
            {10, 9, 8, 7, 6, 5, 4}  // INGLES
        };

        String[] modulos = {"SI", "LDM", "PEJ", "EDD", "FOL", "INGLES"};
        String[] nombres = {"Jorge", "Luis", "Berta", "Eva", "Juan", "Raquel"};

        // SEGUNDO: Llamar a método mostrarNotas()
        mostrarNotas(notasAlumnos, modulos, nombres);

        // TERCERO: Llamar a método calcularMedias()
        calcularMedias(notasAlumnos, nombres);

        // CUARTO: Llamar a método contabilizarValores()
        contabilizarValores(notasAlumnos);
    }

    // Método para mostrar notas de los alumnos
    public static void mostrarNotas(int[][] notas, String[] modulos, String[] nombres) {
        System.out.println("Notas de los alumnos:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + ": ");
            for (int j = 0; j < modulos.length; j++) {
                System.out.print(modulos[j] + ": " + notas[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular y mostrar las medias de los alumnos
    public static void calcularMedias(int[][] notas, String[] nombres) {
        System.out.println("\nMedias de los alumnos:");
        double mejorMedia = -1;
        String mejorAlumno = "";

        for (int i = 0; i < nombres.length; i++) {
            int suma = 0;
            int contador = 0;
            for (int j = 0; j < notas.length; j++) {
                if (notas[j][i] != 0 && notas[j][i] != 22) {
                    suma += notas[j][i];
                    contador++;
                }
            }
            double media = (contador == 0) ? 0 : (double) suma / contador;
            System.out.println(nombres[i] + ": " + media);
            if (media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = nombres[i];
            }
        }
        System.out.println("El alumno con mejor media es: " + mejorAlumno + " con una media de: " + mejorMedia);
    }

    // Método para contabilizar y mostrar los valores de las notas
    public static void contabilizarValores(int[][] notas) {
        int[] contadores = new int[23]; // Array para contar las notas del 0 al 22

        for (int[] fila : notas) {
            for (int nota : fila) {
                contadores[nota]++;
            }
        }

        System.out.println("\nConteo de valores:");
        for (int i = 1; i < contadores.length; i++) {
            if (contadores[i] > 0) {
                System.out.println(i + ": " + contadores[i]);
            }
        }
    }
}
