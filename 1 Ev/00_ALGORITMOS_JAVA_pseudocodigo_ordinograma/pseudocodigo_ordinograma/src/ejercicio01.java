import java.util.Scanner;
public class ejercicio01 {
    /**
     * Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        double radioCir, diametroCir, longitudCir, areaCir; // Variables
        System.out.println("");
        System.out.print("Introduce el valor del diámetro de la circunferencia: "); // Pedir al usuario el valor del diámetro de la circunferencia
        diametroCir = sc.nextDouble(); // Guardar el valor del diámetro de la circunferencia en la variable diametroCir
        radioCir = diametroCir / 2; // Calcular el valor del radio de la circunferencia
        longitudCir = 2 * Math.PI * radioCir; // Calcular la longitud de la circunferencia
        areaCir = Math.PI * Math.pow(radioCir, 2); // Calcular el área de la circunferencia
        System.out.println("El valor del radio de la circunferencia es: " + radioCir); // Imprimir por pantalla el valor del radio de la circunferencia
        System.out.println("La longitud de la circunferencia es: " + longitudCir); // Imprimir por pantalla la longitud de la circunferencia
        System.out.println("El área de la circunferencia es: " + areaCir); // Imprimir por pantalla el área de la circunferencia
        System.out.println("");
        sc.close(); // Cerrar el objeto Scanner
    } 
}