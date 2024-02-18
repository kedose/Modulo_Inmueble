package Inmueble_Privado;
import Inmueble.Inmueble;
import Inmueble.TituloPropiedad;

public abstract class InmueblePrivado extends Inmueble{

    public InmueblePrivado(double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
    }
}

