import java.util.Scanner;

public class ejercicio07 { // Definir la clase
    public static void main(String[] args) { // Definir el mêtodo principal
        try {
            Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
            System.out.println("");
            int num, positivos = 0, negativos = 0, ceros = 0; // Declarar variables
            for (int i = 1; i <= 15; i++) { // Crear un bucle for que se repite 15 veces
                System.out.print("Introduce un número: "); // Pedir al usuario un número
                num = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable num
                if (num > 0) { // Si el número es positivo
                    positivos++; // Sumar 1 positivo
                } else if (num < 0) { // Si el número es negativo
                    negativos++; // Sumar 1 negativo
                } else { // Si el número es cero
                    ceros++; // Sumar 1 cero
                }
            }
            System.out.println("Números positivos: " + positivos); // Imprimir por pantalla los números
            System.out.println("Números negativos: " + negativos); // Imprimir por pantalla los números
            System.out.println("Números ceros: " + ceros); // Imprimir por pantalla los números
            System.out.println("");
            sc.close();
        } catch (Exception e) {
            System.out.println("\nSalida forzada"); // Imprimir por pantalla salida forzada
        }
    }
}