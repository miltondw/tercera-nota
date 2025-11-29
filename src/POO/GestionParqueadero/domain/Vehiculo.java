package POO.GestionParqueadero.domain;

/**
 * Clase del dominio que representa un vehículo
 */
public class Vehiculo {
    private String placa;
    private TipoVehiculo tipo;
    private String propietario;

    /**
     * Enum para los tipos de vehículo permitidos
     */
    public enum TipoVehiculo {
        CARRO, MOTO
    }

    /**
     * Constructor de la clase Vehiculo
     * 
     * @param placa       Placa del vehículo
     * @param tipo        Tipo de vehículo (CARRO o MOTO)
     * @param propietario Nombre del propietario
     */
    public Vehiculo(String placa, TipoVehiculo tipo, String propietario) {
        this.placa = placa.toUpperCase();
        this.tipo = tipo;
        this.propietario = propietario;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s", tipo, placa, propietario);
    }
}
