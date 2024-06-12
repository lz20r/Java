package multimedia;

/**
 * Clase ArrayMultimedia
 */
public class ArrayMultimedia {
    private Multimedia[] miLista;
    private int numOB;

    /**
     * Constructor 
     * @param max
     */
    public ArrayMultimedia(int max) {
        miLista = new Multimedia[max];
        numOB = 0;
    }

    /**
     * @return
     */
    public int size() {
        return numOB;
    }

    /**
     * @param obj
     * @return
     */
    public boolean añadirObjeto(Multimedia obj) {
        if (numOB < miLista.length) {
            miLista[numOB++] = obj;
            return true;
        }
        return false;
    }

    /**
     * @param indice
     * @return
     */
    public Album buscarAlbum(int indice) {
        if (indice >= 0 && indice < numOB && miLista[indice] instanceof Album) {
            return (Album) miLista[indice];
        }
        return null;
    }

    /**
     * @param obj
     * @return
     */
    public int buscarIndice(Multimedia obj) {
        for (int i = 0; i < numOB; i++) {
            if (miLista[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param indice
     * @return
     */   
    public void buscarPelicula(String titulo) {
        for (int i = 0; i < numOB; i++) {
            if (miLista[i] instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) miLista[i];
                if (pelicula.toString().contains(titulo)) {
                    System.out.println(pelicula.toString());
                    return;
                }
            }
        }
        System.out.println("Película no encontrada.");
    }

    /**
     * @param indice
     * @return
     */
    public boolean borrarPelicula(String titulo) {
        for (int i = 0; i < numOB; i++) {
            if (miLista[i] instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) miLista[i];
                if (pelicula.toString().contains(titulo)) {
                    for (int j = i; j < numOB - 1; j++) {
                        miLista[j] = miLista[j + 1];
                    }
                    miLista[--numOB] = null;
                    return true;
                }
            }
        }
        return false;
    }

    /** 
     * @return
     */ 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numOB; i++) {
            sb.append(miLista[i].toString()).append("\n---------------------\n");
        }
        return sb.toString();
    }
}
