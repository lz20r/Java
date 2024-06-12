package multimedia;

public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private int duracion;
    private double precio = 10.0;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return String.format("Titulo: %s\nAutor: %s\nFormato: %s\nDuracion: %d minutos\nPrecio: %.2f euros", 
                            titulo, autor, formato, duracion, precio);
    }

    public boolean igual(Multimedia otro) {
        return this.titulo.equals(otro.titulo) && this.autor.equals(otro.autor);
    }

    public double calcularCoste() {
        return precio * 1.21; // IVA del 21%
    }
}
