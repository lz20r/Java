public class Administrativo extends Empleado {
    private double sueldoMin;

    public Administrativo(String nombre, int edad, int añoIncorporacion, double sueldoMin) {
        super(nombre, edad, añoIncorporacion);
        this.sueldoMin = sueldoMin;
    }

    @Override
    public String toString() {
        return super.toString() +
        "- Sueldo mínimo: " + sueldoMin + "\n";
    }
}