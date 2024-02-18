package Inmueble;
public class Departamento extends InmueblePrivado {


    private int idDepartamento;

    public Departamento(double dimensiones, String ubicacion, double alicuota, int idDepartamento) {
        super(dimensiones, ubicacion, alicuota);
        this.idDepartamento = idDepartamento;
    }


    @Override
    public String toString() {
        return "Departamento " +
                "idDepartamento: " + idDepartamento +
                ", dimensiones: " + dimensiones +
                ", ubicacion: " + ubicacion +
                ", alicuota: " + alicuota;
    }


}
