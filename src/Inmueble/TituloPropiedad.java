package Inmueble;
import java.io.FileWriter;
import java.io.IOException;

public class TituloPropiedad {
    private String ci;
    private String nombrePropietario;
    private int numeroPredio;

    public TituloPropiedad(String con, String nombrePropietario, int numeroPodio) {
        this.ci = con;
        this.nombrePropietario = nombrePropietario;
        this.numeroPredio = numeroPodio;
    }

    public void crearTitulo() {
        String fileName = "titulo_propiedad_" + this.nombrePropietario + ".txt";
    try (FileWriter writer = new FileWriter(fileName)) {
        writer.write("Cedula identidad: " + this.ci + "\n");
        writer.write("Propietario: " + this.nombrePropietario + "\n");
        writer.write("Número de podio: " + this.numeroPredio + "\n");
        System.out.println("Título de propiedad creado correctamente en el archivo: " + fileName);
    } catch (IOException e) {
        System.out.println("Error al crear el título de propiedad en el archivo: " + fileName);
        e.printStackTrace();
    }

    }

}