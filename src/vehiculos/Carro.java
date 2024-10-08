package vehiculos;

public class Carro extends Vehiculo {
        private String tipoCombustible;

    public Carro(int id, String marca, String modelo, int anio, double costoDiario, String tipoCombustible) {
        super(id, marca, modelo, anio, costoDiario);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {}



}
