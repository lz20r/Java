import java.util.Scanner; // Importar la clase Scanner
public class ejercicio03 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
            int num; // Declarar una variable de tipo entero
            do {
                System.out.println(""); // Salto de línea de comandos
                System.out.print("Introduce un número: "); // Pedir al usuario un número
                num = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable num
                if (num == 0) { // Si el número introducido es 0
                    System.out.println("\nFin del programa\n"); // Imprimir por pantalla fin del programa
                } else if (num % 2 == 0) { // Si el número introducido es par
                    System.out.println(num + " es par"); // Si el número introducido es par
                } else {
                    System.out.println(num + " es impar");  // Si el número introducido es impar
                }
            } while (num != 0); // Mientras el número introducido no sea 0
            sc.close();   
        } catch (Exception e) { // Capturar la excepción
            System.out.println("\nSalida forzada"); // Imprimir por pantalla salida forzada
        }
    }
}