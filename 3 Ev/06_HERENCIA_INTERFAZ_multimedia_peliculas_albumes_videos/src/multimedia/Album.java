package multimedia;

/**
 * Clase Album que hereda de Multimedia
 */
public class Album extends Multimedia {
    private static int contador = 0;
    private int codigoA;
    private int numCanciones;
    private int añoLanzamiento;

    /**
     * Constructor de la clase Album
     * @param titulo
     * @param autor
     * @param formato
     * @param duracion
     * @param numCanciones
     * @param añoLanzamiento
     */
    public Album(String titulo, String autor, String formato, int duracion, int numCanciones, int añoLanzamiento) {
        super(titulo, autor, formato, duracion);
        this.codigoA = ++contador;
        this.numCanciones = numCanciones;
        this.añoLanzamiento = añoLanzamiento;
    }

    /**
     * Calcula el coste del album
     * @return coste del album
     */
    @Override
    public double calcularCoste() {
        double coste = super.calcularCoste();
        int añoActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if (añoLanzamiento == añoActual) {
            coste *= 1.30;
        }
        return coste;
    }

    /**
     * toString de la clase Album
     * @return String
     */
    @Override
    public String toString() {
        return String.format("%s\nCodigoA: %d\nNum Canciones: %d\nAño Lanzamiento: %d", 
                            super.toString(), codigoA, numCanciones, añoLanzamiento);
    } 
}
