package Inmueble_Privado;

import Inmueble.TituloPropiedad;

public class Departamento extends InmueblePrivado {
    private String idDepartamento;

    public Departamento(String idDepartamento, double metrosCuadrados, String ubicacion, boolean necesitaMantenimiento, double alicuota, TituloPropiedad tituloPropiedad) {
        super(metrosCuadrados, ubicacion, necesitaMantenimiento, alicuota, tituloPropiedad);
        this.idDepartamento = idDepartamento;
    }

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    
}
