package Inmueble_Comun;
import Inmueble.Inmueble;
import Inmueble.TituloPropiedad;

public abstract class InmuebleComun extends Inmueble{

    boolean disponible;
    int capacidad;

    public InmuebleComun(boolean disponible, int capacidad, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.disponible = disponible;
        this.capacidad = capacidad;
    }

    public boolean consultarDisponibilidad() {
        return disponible;
    }

    public int consultarCapacidad() {
        return capacidad;
    }

    
    public void reservar(boolean disponible) {
        this.disponible = disponible;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}

