import java.util.Scanner; // Importar la clase Scanner
public class ejercicio08 {
    public static void main(String[] args) {
        try {
            System.out.println(""); 
            Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
            int num, max = 0; // Declarar variables
            System.out.print("Introduce un número (0 para parar): "); // Pedir al usuario un número
            num = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable num
            while (num != 0) { // Mientras el número introducido no sea 0
                if (num > max) { // Si el número introducido es mayor que el maximo
                    max = num; // Actualizar el maximo
                }
                System.out.print("Introduce un número (0 para parar): "); // Pedir al usuario un número
                num = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable num
            }
            System.out.println("El mayor de los números introducidos es: " + max); // Imprimir por pantalla el maximo
            System.out.println(""); 
            sc.close(); // Cerrar el objeto Scanner
        } catch (Exception e) {
            System.out.println("\nSalida forzada"); // Imprimir por pantalla salida forzada
        } 
    }
}