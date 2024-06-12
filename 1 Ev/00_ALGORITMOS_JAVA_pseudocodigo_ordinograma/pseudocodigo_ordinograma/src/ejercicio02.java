import java.util.Scanner;
public class ejercicio02 {
    /**
     *  Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("");
        System.out.print("Introduce el primer número: "); // Pedir al usuario el primer número
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: "); // Pedir al usuario el segundo número
        num2 = sc.nextInt();
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2); // Imprimir por pantalla si el primer número es múltiplo del segundo
            System.out.println("");
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1); // Imprimir por pantalla si el segundo número es múltiplo del primero
            System.out.println("");
        } else {
            System.out.println("Los números no son múltiplos entre sí"); // Imprimir por pantalla si los números no son múltiplos entre sí
            System.out.println("");
        }
        sc.close(); // Cerrar el objeto Scanner
    }
}