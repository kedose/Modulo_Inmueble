package Inmueble;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Condominio extends Inmueble{
 
    private List<Inmueble> listaInmuebles;

    public Condominio() {
        super(0, false);
        this.listaInmuebles = new ArrayList<>();
    }
    
    public void agregarInmueble(int metrosCuadrados, boolean mantenimiento) {
        Inmueble inmueble = new Inmueble(metrosCuadrados, mantenimiento) {};
        listaInmuebles.add(inmueble);
    }

    public void crearCondominio() {
        String fileName = "condominio.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Condominio creado con los siguientes inmuebles:\n");
            for (Inmueble inmueble : listaInmuebles) {
                writer.write("- Metros cuadrados: " + inmueble.getMetrosCuadrados() +
                        ", Mantenimiento: " + inmueble.isMante() + "\n");
            }
            System.out.println("Condominio creado correctamente en el archivo: " + fileName);
        } catch (IOException e) {
            System.out.println("Error al crear el condominio en el archivo: " + fileName);
            e.printStackTrace();
        }
    }

    void crearCondominio(int metrosCuadrados, boolean mantenimiento) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}