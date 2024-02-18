package Inmueble_Privado;

import Inmueble.TituloPropiedad;

public class ParqueaderoPrivado extends InmueblePrivado {
    private String idParqueadero;

    public ParqueaderoPrivado(String idParqueadero, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.idParqueadero = idParqueadero;
    }

    public String getIdParqueadero() {
        return idParqueadero;
    }
}
