package discos_canciones;

/**
 * Clase que representa una canción.
 */
public class Cancion {
    private String titulo; //atributo para el título de la canción
    private double duracion; //atributo para la duración de la canción
    private String cantante; //atributo para el cantante de la canción

    /**
     * Constructor de la clase Cancion.
     * @param titulo 
     * @param duracion
     */
    public Cancion(String titulo, double duracion) { //constructor de la clase Cancion
        this.titulo = titulo; //asignamos el título de la canción
        this.duracion = duracion; //asignamos la duración de la canción
    }

    /**
     * Obtiene el título de la canción.
     * @return Título de la canción.
     */
    public String getTitulo() { //método para obtener el título de la canción
        return titulo;
    }

    /**
     * Obtiene la duración de la canción.
     * @return Duración de la canción.
     */
    public double getDuracion() { //método para obtener la duración de la canción
        return duracion; //devolvemos la duración de la canción
    }

    /**
     * Obtiene el cantante de la canción.
     * @return Cantante de la canción.
     */
    public String getCantante() { //método para obtener el cantante de la canción
        return cantante; //devolvemos el cantante de la canción
    }

    /**
     * Establece el cantante de la canción.
     * @param cantante Cantante de la canción.
     */
    public void setCantante(String cantante) { //método para establecer el cantante de la canción
        this.cantante = cantante; //asignamos el cantante de la canción
    }

    /**
     * Representación textual de la canción.
     * @return Cadena con los datos de la canción.
     */
    @Override
    public String toString() {  //método para representar la canción como una cadena de texto
        return "Titulo: " + titulo + ", Duracion: " + duracion + ", Cantante: " + cantante; //devolvemos una cadena con los datos de la canción
    }
}
