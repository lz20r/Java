import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner
        String nombre; // Declarar una variable de tipo cadena
        String nombreMaxPromedio = ""; // Para guardar el nombre del estudiante con el promedio más alto
        double maxPromedio = 0; // Para guardar el mayor promedio
        double sumaNotasTotales = 0; // Para la suma de todas las notas de todos los estudiantes
        int totalEstudiantes = 0; // Para contar el número de estudiantes
        
        while (true) {
            System.out.println("");
            System.out.printf("Introduce el nombre del estudiante %d (0 para parar): ", totalEstudiantes + 1); // Pedir al usuario un nombre de estudiante 
            nombre = sc.nextLine(); // Guardar el valor introducido por el usuario en la variable nombre
            
            if (nombre.equals("0")) {
                break; // Salir del bucle si el nombre es "0"
            }
            
            double sumaNotasEstudiante = 0; // Suma de las notas de un estudiante
            for (int i = 0; i < 6; i++) { // Crear un bucle for que se repite 6 veces
                System.out.printf("Introduce la nota %d del estudiante %s: ", i + 1, nombre); // Pedir al usuario una nota
                int nota = sc.nextInt(); // Guardar el valor introducido por el usuario en la variable nota
                sumaNotasEstudiante += nota; // Sumar la nota a la suma del estudiante
                sumaNotasTotales += nota; // Sumar la nota a la suma total
            }
            sc.nextLine(); // Limpiar el buffer
            
            double promedioEstudiante = sumaNotasEstudiante / 6; // Calcular el promedio del estudiante
            System.out.printf("El promedio del estudiante %s es %.2f\n", nombre, promedioEstudiante); // Imprimir el promedio del estudiante
            
            totalEstudiantes++; // Incrementar el contador de estudiantes

            // Verificar si el promedio del estudiante es mayor que el promedio máximo encontrado
            if (promedioEstudiante > maxPromedio) {
                maxPromedio = promedioEstudiante; // Actualizar el promedio máximo
                nombreMaxPromedio = nombre; // Actualizar el nombre del estudiante con el promedio más alto
            }
        }
        
        // Imprimir los resultados finales
        if (totalEstudiantes > 0) {
            System.out.printf("El estudiante con el promedio más alto es %s con un promedio de %.2f\n", nombreMaxPromedio, maxPromedio); // Imprimir el nombre del estudiante con el promedio más alto
            System.out.printf("El promedio total de todas las notas es %.2f\n", sumaNotasTotales / (totalEstudiantes * 6)); // Imprimir el promedio total de todas las notas
            System.out.println("Se ingresaron " + totalEstudiantes + " estudiantes."); // Imprimir el número de estudiantes
            System.out.println("");
        } else {
            System.out.println("No se ingresaron notas.");
        } 
        sc.close(); // Cerrar el objeto Scanner
    }
}
