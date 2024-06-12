public class PrincipalException04 {

    // Definimos la excepción personalizada
    static class MiException04 extends Exception {
        private String mensaje;

        // Constructor que acepta un mensaje
        public MiException04(String mensaje) {
            super(mensaje);
            this.mensaje = mensaje;
        }

        // Método para obtener el mensaje almacenado
        public String getMiMensaje() {
            return mensaje;
        }
    }

    public static void main(String[] args) {
        try {
            // Lanzar una nueva instancia de nuestra excepción personalizada
            throw new MiException04("\nEste es un mensaje de excepción personalizado.\n");
        } catch (MiException04 e) {
            // Capturar la excepción y mostrar el mensaje utilizando getMiMensaje()
            System.out.println("\nSe ha capturado una excepción: " + e.getMiMensaje() + "\n");
        }
    }
}
