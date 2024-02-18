package Inmueble;

import Inmueble_Privado.Departamento;
import Inmueble_Privado.ParqueaderoPrivado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Condominio extends Inmueble{
 
    private List<Inmueble> listaInmuebles;

    public Condominio() {
        super(0, null, false, 0, null);
        this.listaInmuebles = new ArrayList<>();
    }


    public Condominio(List<Inmueble> listaInmuebles, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.listaInmuebles = listaInmuebles;
    }
    
    //si se incluye un nuevo inmueble a la lista después de la creación del condominio
    public void agregarInmueble(Inmueble inmueble) {
        listaInmuebles.add(inmueble);
    }

    public void crearCondominio(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                Inmueble inmueble = new Inmueble() {
                };

                String[] parts = line.split(",");
                double metrosC = Double.parseDouble(parts[0]);
                String ubicacionI = parts[1];
                boolean mantenimiento = Boolean.parseBoolean(parts[2]);
                double valorAlicuota = Double.parseDouble(parts[3]);
                String cedula = parts[4];
                String nombre = parts[5];
                String predio = parts[6];
                TituloPropiedad tituloPropiedadI = new TituloPropiedad(cedula, nombre, predio);

                if (parts[7] != null && parts[8] != null) {
                    boolean disponibilidadReserva = Boolean.parseBoolean(parts[7]);
                    int aforo = Integer.parseInt(parts[8]);
                    Inmueble inmueblePublico = new Inmueble(metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI) {
                    };
                    inmueble = inmueblePublico;
                } else {
                    if (parts[10] != null) {
                        String id_Departamento = parts[9];
                        Inmueble_Privado.Departamento departamento = new Departamento(id_Departamento, metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = departamento;
                    }
                    if (parts[10] != null) {
                        String id_Parqueadero = parts[10];
                        Inmueble_Privado.ParqueaderoPrivado parqueaderoP = new ParqueaderoPrivado(id_Parqueadero, metrosC, ubicacionI, mantenimiento, valorAlicuota, tituloPropiedadI);
                        inmueble = parqueaderoP;
                    }
                }
                
                agregarInmueble(inmueble);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + nombreArchivo);
        }
    }       
}