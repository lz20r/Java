import java.util.Scanner;
import java.util.Arrays;

public class ejercicio05 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Crear un array para almacenar los números
            int[] numeros = new int[3];
    
            // Leer tres números mayores de cero
            System.out.println("");
            for (int i = 0; i < 3; i++) {
                System.out.print("Introduce un número mayor que cero: ");
                numeros[i] = scanner.nextInt();
    
                // Verificar que el número es mayor que cero
                while (numeros[i] <= 0) {
                    System.out.print("El número debe ser mayor que cero. Inténtalo de nuevo: ");
                    numeros[i] = scanner.nextInt();
                }
            }
    
            // Ordenar los números en orden ascendente
            Arrays.sort(numeros);
    
            // Imprimir los números en orden ascendente
            System.out.println("Números en orden ascendente:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
            scanner.close();    
            System.out.println("");
        } catch (Exception e) {
            System.out.println("\nSalida forzada");
        }
    }
}