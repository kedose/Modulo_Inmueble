package Inmueble;

public abstract class Inmueble {
    double metrosCuadrados;
    boolean necesitaMantenimiento;
    double alicuota;

// Constructor vacío
    public Inmueble() {
    }

// Constructor con parámetros  
    public Inmueble(double metrosCuadrados, boolean necesitaMantenimiento, double alicuota) {
        this.metrosCuadrados = metrosCuadrados;
        this.necesitaMantenimiento = necesitaMantenimiento;
        this.alicuota = alicuota;
    }
// Getters y Setters
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    
    public boolean isNecesitaMantenimiento() {
        return necesitaMantenimiento;
    }

    public double getAlicuota() {
        return alicuota;
    }

    public void setMetrosCuadrados(double metros_cuadrados) {
        this.metrosCuadrados = metros_cuadrados;
    }

    public void setNecesitaMantenimiento(boolean necesitaMantenimiento) {
        this.necesitaMantenimiento = necesitaMantenimiento;
    }

    public void setAlicuota(double alicuota) {
        this.alicuota = alicuota;
    }

// Métodos
    public boolean consultarMantenimiento(){
        return necesitaMantenimiento;
    }
    
    public void actualizarAlicuota(MOVIMIENTO_FINANCIERO mov_financiero){
        alicuota=mov_financiero.calcularAlicuota();
    }
}