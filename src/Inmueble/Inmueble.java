package Inmueble;

public abstract class Inmueble {
    double metrosCuadrados;
    String ubicacion;
    boolean necesitaMantenimiento;
    double alicuota;
    TituloPropiedad tituloPropiedad;

// Constructor vacío
    public Inmueble() {
    }

// Constructor con parámetros  
    public Inmueble(double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        this.metrosCuadrados = metrosCuadrados;
        this.ubicacion = ubicacion;
        this.necesitaMantenimiento = necesitaMantenimiento;
        this.alicuota = alicuota;
        this.tituloPropiedad = tituloPropiedad;
    }

// Getters y Setters
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isNecesitaMantenimiento() {
        return necesitaMantenimiento;
    }

    public double getAlicuota() {
        return alicuota;
    }

    public TituloPropiedad getTituloPropiedad() {
        return tituloPropiedad;
    }

    public void setMetrosCuadrados(double metros_cuadrados) {
        this.metrosCuadrados = metros_cuadrados;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setNecesitaMantenimiento(boolean necesitaMantenimiento) {
        this.necesitaMantenimiento = necesitaMantenimiento;
    }

    public void setAlicuota(double alicuota) {
        this.alicuota = alicuota;
    }

    public void setTituloPropiedad(TituloPropiedad tituloPropiedad) {
        this.tituloPropiedad = tituloPropiedad;
    }
}