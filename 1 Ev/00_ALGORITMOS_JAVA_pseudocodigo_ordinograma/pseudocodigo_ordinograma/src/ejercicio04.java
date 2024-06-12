import java.util.Scanner; // Importar la clase Scanner
public class ejercicio04 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
            int num; // Declarar una variable de tipo entero
            System.out.print("\nIntroduce un número del 1 al 10: "); // Pedir al usuario un número
            num = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable num
            if (num < 1 || num > 10) { // Si el número introducido no es del 1 al 10
                System.out.println("\nEl número introducido no es válido"); // Imprimir por pantalla el número introducido no es del 1 al 10
            } else {
                System.out.println("\nLa tabla de multiplicación del " + num + ":" + "\n"); // Imprimir por pantalla la tabla de multiplicación del
                for (int i = 1; i <= 10; i++) { // Crear un bucle for que se repite 10 veces 
                    System.out.println(num + " x " + i + " = " + (num * i)); // Imprimir por pantalla el valor de la multiplicación
                    System.out.println("");
                } 
            }
            sc.close(); // Cerrar el objeto Scanner    
        } catch (Exception e) {
            System.out.println("\nSalida forzada"); // Imprimir por pantalla salida forzada
        }
    }
}