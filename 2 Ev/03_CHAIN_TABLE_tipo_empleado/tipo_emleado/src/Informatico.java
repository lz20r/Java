public class Informatico extends Empleado {
    private double sueldoMin;
    private int proyectos;

    public Informatico(String nombre, int edad, int añoIncorporacion, double sueldoMin, int proyectos) {
        super(nombre, edad, añoIncorporacion);
        this.sueldoMin = sueldoMin;
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return super.toString() +
        "- Sueldo mínimo: " + sueldoMin + "\n" +
        "- Proyectos: " + proyectos + "\n";
    }
}