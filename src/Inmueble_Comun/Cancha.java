package Inmueble_Comun;

import Inmueble.TituloPropiedad;

public class Cancha extends InmuebleComun {
    private String idCancha;
    private String tipoCancha;

    public Cancha(String idCancha, String tipoCancha, boolean disponible, int capacidad, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(disponible, capacidad, metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.idCancha = idCancha;
        this.tipoCancha = tipoCancha;
    }

}
