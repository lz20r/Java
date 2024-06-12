import java.util.Random;
import java.util.Scanner;

public class CodificacionMensajes {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Mensajes predefinidos
            String[] mensajesPredefinidos = {
                "Mensaje predefinido 1",
                "Mensaje predefinido 2",
                "Mensaje predefinido 3"
            };

            // Generar número aleatorio entre 1 y 8
            int numeroAlAzar = random.nextInt(8) + 1;

            String mensaje;
            if (numeroAlAzar >= 1 && numeroAlAzar <= 3) {
                // Seleccionar un mensaje predefinido
                mensaje = mensajesPredefinidos[numeroAlAzar - 1];
            } else { 
                // Pedir al usuario que introduzca un mensaje
                System.out.print("\nIntroduce el mensaje a codificar: ");
                mensaje = scanner.nextLine();
            }

            // Pedir al usuario que introduzca la clave
            System.out.print("\nIntroduce la clave (número entero): ");
            int clave = scanner.nextInt();

            // Codificar el mensaje
            StringBuilder mensajeCodificado = new StringBuilder();
            for (int i = 0; i < mensaje.length(); i++) {
                char caracter = mensaje.charAt(i);
                int codigo = (int) caracter;
                int codigoTrans = codigo + clave;
                char caracterTrans = (char) codigoTrans;
                mensajeCodificado.append(caracterTrans);
            }

            // Mostrar el mensaje codificado
            System.out.println("\nMensaje codificado: " + mensajeCodificado.toString() + "\n"); 
            scanner.close();
        } catch (Exception e) {
            System.out.println("Salida forzada");
        } 
    }
}
