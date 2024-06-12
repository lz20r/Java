import java.util.Scanner;

/**
 * Clase para calcular el factorial de un número introducido por el usuario.
 */
public class ejercicio09 {
    
    /**
     * Método principal que solicita un número al usuario, calcula su factorial y lo imprime.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        try {
            System.out.println(""); 
            Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
            int num, fact = 1; // Declarar variables
            System.out.print("Introduce un número: "); // Pedir al usuario un número
            num = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable num
            
            // Imprimir el desarrollo del cálculo del factorial
            System.out.print(" " + num + "! = "); // Imprimir el valor de num
            for (int i = 1; i <= num; i++) { // Crear un bucle for que se repite num veces 
                fact = fact * i; // Multiplicar el factorial por el valor de i
                System.out.print(i); // Imprimir el valor de i
                if (i < num) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + fact); // Imprimir el resultado final del desarrollo

            System.out.println("El factorial de " + num + " es: " + fact); // Imprimir por pantalla el factorial calculado en el bucle
            System.out.println(""); 
            sc.close(); // Cerrar el objeto Scanner
        } catch (Exception e) {
            System.out.println("\nSalida forzada"); // Imprimir por pantalla salida forzada
        }
    }

    /**
     * Calcula el factorial de un número dado.
     *
     * @param num el número del cual se quiere calcular el factorial
     * @return el factorial del número dado
     */
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
