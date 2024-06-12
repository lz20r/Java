import java.io.*;
import java.util.Scanner;

public class Alumnos02 {
    public static void grabarAlumnos(DataOutputStream dos) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;
    
            while (continuar) {
                System.out.println("");
                System.out.print("Introduce el nombre del alumno: ");
                String nombre = scanner.nextLine();
                System.out.print("Introduce la edad del alumno: ");
                int edad = scanner.nextInt();
                System.out.print("Introduce las tres notas del alumno: ");
                double nota1 = scanner.nextDouble();
                double nota2 = scanner.nextDouble();
                double nota3 = scanner.nextDouble();
                scanner.nextLine(); // Consumir nueva línea
    
                dos.writeUTF(nombre);
                dos.writeInt(edad);
                dos.writeDouble(nota1);
                dos.writeDouble(nota2);
                dos.writeDouble(nota3);
    
                System.out.print("¿Quieres introducir otro alumno? (si/no): ");
                continuar = scanner.nextLine().equalsIgnoreCase("si");
            }
    
            scanner.close();
        } catch (Exception e) { 
            System.out.println("\n\nSalida forzada del programa\n");
        }
    }

    public static void muestraDatosAlumnos(DataInputStream dis) throws IOException {
        boolean fin = false;
        double mejorMedia = 0;
        String mejorAlumno = "";

        while (!fin) {
            try {
                String nombre = dis.readUTF();
                int edad = dis.readInt();
                double nota1 = dis.readDouble();
                double nota2 = dis.readDouble();
                double nota3 = dis.readDouble();

                double media = (nota1 + nota2 + nota3) / 3;
                System.out.println("- Alumno: " + nombre + ", Edad: " + edad + ", Media: " + media);
                System.out.println("");

                if (media > mejorMedia) {
                    mejorMedia = media;
                    mejorAlumno = nombre;
                }
            } catch (EOFException e) {
                fin = true;
            }
        }

        System.out.println("- El alumno con mejor media es: " + mejorAlumno + " con una media de " + mejorMedia);
        System.out.println("");
    }

    public static void main(String[] args) {
        File archivo = new File("alumnos.dat");

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo));
            DataInputStream dis = new DataInputStream(new FileInputStream(archivo))) {

            grabarAlumnos(dos);
            muestraDatosAlumnos(dis);

        } catch (IOException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }
}
