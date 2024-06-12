package discos_canciones;
//importamos la clase ArrayList
import java.util.ArrayList;

/**
 * Clase que representa un disco.
 */
public class Disco {
    private String nombre;
    private int maxCanciones;
    private ArrayList<Cancion> canciones;

    /**
     * Constructor de la clase Disco.
     * @param nombre Nombre del disco.
     * @param maxCanciones Número máximo de canciones que puede contener el disco.
     */
    public Disco(String nombre, int maxCanciones) {
        this.nombre = nombre; //asignamos el nombre del disco
        this.maxCanciones = maxCanciones; //asignamos el número máximo de canciones
        this.canciones = new ArrayList<>(); //inicializamos el ArrayList de canciones
    }

    /**
     * Inserta una canción en el disco.
     * @param cancion Canción a insertar.
     * @return true si la canción se ha insertado correctamente, false en caso contrario.
     */
    public boolean insertar(Cancion cancion) { //método para insertar una canción
        if (canciones.size() < maxCanciones) { //si el número de canciones es menor que el máximo   
            canciones.add(cancion); //añadimos la canción al ArrayList
            return true;  
        } else {     
            return false;
        }
    }

    /**
     *  Busca una canción por el cantante.
     * @param cantante
     * @return
     */
    public Cancion buscar(String cantante) { //método para buscar una canción por el cantante
        for (Cancion cancion : canciones) { //recorremos el ArrayList de canciones
            if (cancion.getCantante().equalsIgnoreCase(cantante)) { //si el cantante de la canción coincide con el cantante pasado por parámetro
                return cancion; //devolvemos la canción
            }
        }
        return null;
    }

    /**
     * Muestra los datos del disco.
     */
    public void visualizar() {
        System.out.println("Nombre del disco: " + nombre); //mostramos el nombre del disco
        System.out.println("Número máximo de canciones: " + maxCanciones); //mostramos el número máximo de canciones
        System.out.println("Canciones:"); //mostramos las canciones
        for (Cancion cancion : canciones) { //recorremos el ArrayList de canciones
            System.out.println(cancion); //mostramos la canción
        }
    }
}
