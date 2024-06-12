/**
 * Clase para representar un conductor.
 */
public class Conductor {
    private int edad;
    private boolean esMujer;
    private int aniosSinAccidentes;

    public Conductor(int edad, boolean esMujer, int aniosSinAccidentes) {
        this.edad = edad;
        this.esMujer = esMujer;
        this.aniosSinAccidentes = aniosSinAccidentes;
    }

    /**
     * Aplica un descuento al seguro si se cumplen las condiciones.
     * @return true si se aplica el descuento, false en caso contrario.
     */
    public boolean aplicarDescuento() {
        if (edad >= 27 && esMujer && aniosSinAccidentes >= 1) {
            return true;
        } else if (edad >= 27 && !esMujer && aniosSinAccidentes >= 2) {
            return true;
        } else if (edad < 27 && aniosSinAccidentes >= 5) {
            return true;
        } else {
            return false;
        }
    }
}
