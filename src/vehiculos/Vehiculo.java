package vehiculos;

public class Vehiculo {

    private int idVehiculo;
    private String marca;
    private String modelo;
    private int anio;
    private double costoDiario;
    private boolean disponibilidad;

    public Vehiculo(int idVehiculo, String marca, String modelo, int anio, double costoDiario) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costoDiario = costoDiario;
        this.disponibilidad = true;

    }

    public double calcularPrecio(int dias, boolean seguro, boolean gps) {
        double precioBase = costoDiario * dias;
        if (seguro) {
            precioBase += precioBase * 0.10;
        }
        if (gps) {
            precioBase += 5 * dias;
        }
        return precioBase;
    }

        public int getIdVehiculo() {
            return idVehiculo;
        }

        public void setIdVehiculo(int idVehiculo) {
            this.idVehiculo = idVehiculo;
        }


        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }


        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }


        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }


        public double getCostoDiario() {
            return costoDiario;
        }

        public void setCostoDiario(double costoDiario) {
            this.costoDiario = costoDiario;
        }


        public boolean isDisponibilidad() {
            return disponibilidad;
        }

        public void setDisponibilidad(boolean disponibilidad) {
            this.disponibilidad = disponibilidad;
        }
}



