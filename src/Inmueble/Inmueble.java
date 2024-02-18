
package Inmueble;

public abstract class Inmueble {
    double metros_cuadrados;
    boolean necesitaMantenimiento;
    double alicuota;

    public Inmueble() {
    }

    
    public Inmueble(double metros_cuadrados, boolean necesitaMantenimiento, double alicuota) {
        this.metros_cuadrados = metros_cuadrados;
        this.necesitaMantenimiento = necesitaMantenimiento;
        this.alicuota = alicuota;
    }

    public double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public boolean isNecesitaMantenimiento() {
        return necesitaMantenimiento;
    }

    public double getAlicuota() {
        return alicuota;
    }

    public void setMetros_cuadrados(double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public void setNecesitaMantenimiento(boolean necesitaMantenimiento) {
        this.necesitaMantenimiento = necesitaMantenimiento;
    }

    public void setAlicuota(double alicuota) {
        this.alicuota = alicuota;
    }

    

    public boolean consultarMantenimiento(){
        return necesitaMantenimiento;
    }
    
    public void actualizarAlicuota(MOVIMIENTO_FINANCIERO mov_financiero){
        alicuota=mov_financiero.calcularAlicuota();
    }
}