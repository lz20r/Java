public class NullException03 {
    private String cad = "\nsoy un atributo de la clase";

    public String getCad() {
        return cad;
    }

    public static void main(String[] args) {
        NullException03 objeto1 = null;

        try {
            System.out.println(objeto1.getCad());
        } catch (NullPointerException e) {
            System.out.println("\nSe ha producido una excepción: " + e.getMessage());
        } finally {
            System.out.println("\nBloque finally ejecutado");
        }

        System.out.println("\nPrograma finalizado\n");
    }
}
