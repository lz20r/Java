public class Empleado {
    private String nombre;
    private int edad;
    private int añoIncorporacion;

    public Empleado(String nombre, int edad, int añoIncorporacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.añoIncorporacion = añoIncorporacion;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    @Override
    public String toString() {
        return
        "- Tipo de empleado: " + getClass().getSimpleName() + "\n" +
        "- Nombre: " + nombre + "\n" +
        "- Edad: " + edad + "\n" +
        "- Año de incorporación: " + añoIncorporacion + "\n";
    }
}
