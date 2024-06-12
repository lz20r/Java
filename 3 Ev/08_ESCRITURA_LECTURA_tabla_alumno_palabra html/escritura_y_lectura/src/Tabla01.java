import java.io.*;
import java.util.Scanner;

public class Tabla01 {
    /**
     * Genera una tabla de multiplicar de un número
     * @param numero
     * @throws IOException
     */
    public static void grabarFichero(int numero) throws IOException {
        // Define la ruta del archivo
        String rutaCarpeta = "tx/Tabla01";
        File carpeta = new File(rutaCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdirs(); // Crea la carpeta si no existe
        }
        String rutaArchivo = rutaCarpeta + "/tabla.txt";
        
        FileWriter writer = new FileWriter(rutaArchivo);
        writer.write("TABLA DEL " + numero + "\n\n");
        for (int i = 1; i <= 10; i++) {
            writer.write(numero + " * " + i + " = " + (numero * i) + "\n\n"); 
        }
        writer.close();
    }

    /**
     * Lee el fichero especificado y muestra su contenido por consola
     * @throws IOException
     */
    public static void leerFichero() throws IOException {
        String rutaArchivo = "tx/Tabla01/tabla.txt";
        FileReader reader = new FileReader(rutaArchivo);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufferedReader.close();
    }

    /**
     * Programa principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce un número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        System.out.println("");
        
        try {
            grabarFichero(numero);
            leerFichero();
        } catch (IOException e) {
            System.out.print("Se ha producido una excepción: " + e.getMessage());
        }

        scanner.close();
    }
}
