package Inmueble_Comun;

import Inmueble.TituloPropiedad;

public class ParqueaderoPublico extends InmuebleComun {
    private String idParqueadero;

    public ParqueaderoPublico(String idParqueadero, boolean disponible, int capacidad, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(disponible, capacidad, metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.idParqueadero = idParqueadero;
    }

    public String getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(String idParqueadero) {
        this.idParqueadero = idParqueadero;
    }
    
}
