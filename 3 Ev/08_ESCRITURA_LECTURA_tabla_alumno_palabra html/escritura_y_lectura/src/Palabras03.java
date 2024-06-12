import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Palabras03 {
    /**
     * Programa principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        System.out.println("");
        // Define la ruta del archivo
        String rutaCarpeta = "tx/Palabra03";
        File carpeta = new File(rutaCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdirs(); // Crea la carpeta si no existe
        }
        String rutaArchivo = rutaCarpeta + "/palabras.txt";
        // Escribe la frase en el archivo
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            String[] palabras = frase.split(" ");
            writer.write("La frase es: ");
            for (String palabra : palabras) { // Itera sobre las palabras
                writer.write(palabra + " ");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }

        scanner.close();
    }
}
