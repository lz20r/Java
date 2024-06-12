public class ThrowException01 {
    public static void main(String[] args) {
        try {
            // Generamos una excepción con un mensaje
            throw new Exception("\nEsto es una excepción");
        } catch (Exception e) {
            // Capturamos la excepción y mostramos el mensaje
            System.out.println("\nSe ha producido una excepción: " + e.getMessage());
        } finally {
            // Este bloque siempre se ejecuta
            System.out.println("Bloque finally ejecutado\n");
        }
    }
}
