import java.util.Scanner; // Importar la clase Scanner

public class ejercicio06 {
    public static void main(String[] args) {
        try {
            System.out.println("");
            Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
            int horas, minutos, segundos; // Declarar una variable de tipo entero
            System.out.print("Introduce las horas: "); // Pedir al usuario las horas
            horas = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable horas
            System.out.print("Introduce los minutos: "); // Pedir al usuario los minutos
            minutos = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable minutos
            System.out.print("Introduce los segundos: "); // Pedir al usuario los segundos
            segundos = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable segundos
            segundos++; // Sumar 1 segundo
            if (segundos == 60) { // Si los segundos son 60
                segundos = 0; // Los segundos serán 0
                minutos++; // Sumar 1 minuto
                if (minutos == 60) { // Si los minutos son 60
                    minutos = 0; // Los minutos serán 0
                    horas++; // Sumar 1 hora
                    if (horas == 24) { // Si las horas son 24
                        horas = 0; // Las horas serán 0
                    }
                }
            }
            System.out.println("");
            System.out.println("El tiempo es: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos"); // Imprimir por pantalla el tiempo
            sc.close(); // Cerrar el objeto Scanner
            System.out.println("");
        } catch (Exception e) {
            System.out.println("\nSalida forzada"); // Imprimir por pantalla salida forzada
        }
    }
}