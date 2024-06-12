package multimedia;

public class Pelicula extends Multimedia {
    private static int contador = 0;
    private int codigoP;
    private String actorPrincipal;
    private String actrizPrincipal;
    private boolean estreno;

    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal, boolean estreno) {
        super(titulo, autor, formato, duracion);
        this.codigoP = ++contador;

        if (actorPrincipal == null && actrizPrincipal == null) {
            throw new IllegalArgumentException("Uno de los dos actores debe ser no nulo.");
        }

        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
        this.estreno = estreno;
    }

    @Override
    public double calcularCoste() {
        double coste = super.calcularCoste();
        if (estreno) {
            coste += 20;
        }
        return coste;
    }

    @Override
    public String toString() {
        return String.format("%s\nCodigoP: %d\nActor Principal: %s\nActriz Principal: %s\nEstreno: %b",
                            super.toString(), codigoP, actorPrincipal, actrizPrincipal, estreno);
    }
}
