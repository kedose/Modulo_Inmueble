package Inmueble;
public class ParqueaderoPrivado extends InmueblePrivado {


    private int idParqueadero;

    public ParqueaderoPrivado(double dimensiones, String ubicacion, double alicuota, int idParqueadero) {
        super(dimensiones, ubicacion, alicuota);
        this.idParqueadero = idParqueadero;
    }

    public int getIdParqueadero() {
        return idParqueadero;
    }

    @Override
    public String toString() {
        return "ParqueaderoPrivado " +
                "idParqueadero: " + idParqueadero +
                ", dimensiones: " + dimensiones +
                ", ubicacion: " + ubicacion +
                ", alicuota: " + alicuota;
    }


}
