import java.util.Scanner;

public class ArrayException02 {
    // Declaramos un array de enteros con valores
    private int[] array = {10, 20, 30, 40, 50};

    // Método que devuelve el contenido de una posición del array
    public int getValor(int index) {
        return array[index];
    }

    // Método para imprimir el array
    public void imprimirArray() {
        System.out.print("\nContenido del array: ");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println(); // Nueva línea después de imprimir el array
    }

    public static void main(String[] args) {
        // Creamos un objeto de la clase
        ArrayException02 objeto1 = new ArrayException02();
        
        // Imprimimos el contenido del array
        objeto1.imprimirArray();
        
        Scanner scanner = new Scanner(System.in);
        int posicion;

        // Mensaje que indica el rango de valores válidos
        System.out.println("Ingrese una posición del array para ver su contenido.");
        System.out.println("Rango válido de posiciones: 0 a " + (objeto1.array.length - 1));

        // Solicitamos por teclado la posición del array
        System.out.print("Introduzca la posición: ");
        posicion = scanner.nextInt();

        try {
            // Intentamos mostrar el contenido de la posición indicada
            int valor = objeto1.getValor(posicion);
            System.out.println("El valor en la posición " + posicion + " es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Tratamos la excepción si la posición está fuera de rango
            System.out.println("Excepción: fuera de rango. Posición introducida: " + e.getMessage());
        } finally {
            // Mensaje de despedida
            System.out.println("Programa finalizado\n");
        }

        scanner.close();
    }
}