import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Html04 {

    private String titulo;
    private String contenido;
    private String nombreArchivo;
    private String atributosBody;
    private int cantidadSecciones;
    private String colorFondoSecciones;
    private String titulosSecciones;
    private String contenidosSecciones;
    private boolean duplicadoSecciones;
    private String colorFondoSeccionesDuplicadas;

    public void leerDatos() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el titulo de la pagina: ");
        titulo = scanner.nextLine();
        System.out.print("Ingrese el contenido de la pagina: ");
        contenido = scanner.nextLine();
        System.out.print("Ingrese el nombre del archivo (sin extensión): ");
        nombreArchivo = scanner.nextLine();
        System.out.print("Ingrese los atributos del body (e.g., style=\"background-color: #f4f4f9;\"): ");
        atributosBody = scanner.nextLine();
        System.out.print("Ingrese la cantidad de secciones: ");
        cantidadSecciones = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Ingrese el color de fondo de las secciones: ");
        colorFondoSecciones = scanner.nextLine();
        System.out.print("Ingrese el titulo de las secciones: ");
        titulosSecciones = scanner.nextLine();
        System.out.print("Ingrese el contenido de las secciones: ");
        contenidosSecciones = scanner.nextLine();
        System.out.print("¿Desea duplicar las secciones? (si/no): ");
        duplicadoSecciones = scanner.nextLine().equalsIgnoreCase("si");

        if (duplicadoSecciones) {
            System.out.print("Ingrese el color de fondo de las secciones duplicadas: ");
            colorFondoSeccionesDuplicadas = scanner.nextLine();
        }

        scanner.close();
    }

    public void generarHTML() {
        // Define la ruta del archivo
        String rutaCarpeta = "tx/Html04";
        File carpeta = new File(rutaCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdirs(); // Crea la carpeta si no existe
        }
        String rutaArchivo = rutaCarpeta + "/" + nombreArchivo + ".html";

        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("<title>" + titulo + "</title>\n");
            writer.write("<style>\n");
            writer.write("body {\n");
            writer.write("    font-family: Arial, sans-serif;\n");
            writer.write("    margin: 0;\n");
            writer.write("    padding: 20px;\n");
            writer.write("    background-color: #f4f4f9;\n");
            writer.write("}\n");
            writer.write("h1 {\n");
            writer.write("    color: #333;\n");
            writer.write("    text-align: center;\n");
            writer.write("}\n");
            writer.write("section {\n");
            writer.write("    margin: 20px 0;\n");
            writer.write("    padding: 20px;\n");
            writer.write("    border-radius: 8px;\n");
            writer.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
            writer.write("}\n");
            writer.write("h2 {\n");
            writer.write("    color: #555;\n");
            writer.write("}\n");
            writer.write("p {\n");
            writer.write("    color: #666;\n");
            writer.write("}\n");
            writer.write("</style>\n");
            writer.write("</head>\n");
            writer.write("<body " + atributosBody + ">\n");
            writer.write("<h1>" + titulo + "</h1>\n");
            writer.write("<p>" + contenido + "</p>\n");

            for (int i = 0; i < cantidadSecciones; i++) {
                writer.write("<section style=\"background-color: " + colorFondoSecciones + ";\">\n");
                writer.write("<h2>" + titulosSecciones + "</h2>\n");
                writer.write("<p>" + contenidosSecciones + "</p>\n");
                writer.write("</section>\n");
            }

            if (duplicadoSecciones) {
                for (int i = 0; i < cantidadSecciones; i++) {
                    writer.write("<section style=\"background-color: " + colorFondoSeccionesDuplicadas + ";\">\n");
                    writer.write("<h2>" + titulosSecciones + "</h2>\n");
                    writer.write("<p>" + contenidosSecciones + "</p>\n");
                    writer.write("</section>\n");
                }
            }

            writer.write("</body>\n");
            writer.write("</html>\n");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Html04 html = new Html04();
        html.leerDatos();
        html.generarHTML();
    }
}
