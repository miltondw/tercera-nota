package POO.GestionParqueadero.domain;

/**
 * Clase del dominio que representa un espacio de parqueadero
 */
public class EspacioParqueadero {
    private int numeroEspacio;
    private Vehiculo.TipoVehiculo tipoPermitido;
    private boolean ocupado;
    private Vehiculo vehiculoAsignado;

    /**
     * Constructor de la clase EspacioParqueadero
     * 
     * @param numeroEspacio Número identificador del espacio
     * @param tipoPermitido Tipo de vehículo permitido en este espacio
     */
    public EspacioParqueadero(int numeroEspacio, Vehiculo.TipoVehiculo tipoPermitido) {
        this.numeroEspacio = numeroEspacio;
        this.tipoPermitido = tipoPermitido;
        this.ocupado = false;
        this.vehiculoAsignado = null;
    }

    /**
     * Asigna un vehículo a este espacio si es compatible
     * 
     * @param vehiculo Vehículo a asignar
     * @throws Exception Si el espacio está ocupado o el tipo de vehículo no
     *                   coincide
     */
    public void asignarVehiculo(Vehiculo vehiculo) throws Exception {
        // Verificar que el espacio esté disponible
        if (ocupado) {
            throw new Exception("El espacio " + numeroEspacio + " ya está ocupado");
        }

        // Verificar que el tipo de vehículo sea compatible
        if (vehiculo.getTipo() != tipoPermitido) {
            throw new Exception("El espacio " + numeroEspacio + " solo permite vehículos tipo " + tipoPermitido);
        }

        // Asignar el vehículo
        this.vehiculoAsignado = vehiculo;
        this.ocupado = true;
    }

    /**
     * Libera el espacio cambiando su estado a disponible
     */
    public void liberarEspacio() {
        this.ocupado = false;
        this.vehiculoAsignado = null;
    }

    /**
     * Verifica si el espacio está disponible
     * 
     * @return true si está disponible, false si está ocupado
     */
    public boolean estaDisponible() {
        return !ocupado;
    }

    // Getters
    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public Vehiculo.TipoVehiculo getTipoPermitido() {
        return tipoPermitido;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    /**
     * Obtiene el estado del espacio en formato texto
     * 
     * @return Estado del espacio (Disponible u Ocupado con detalles)
     */
    public String getEstadoTexto() {
        if (ocupado && vehiculoAsignado != null) {
            return "Ocupado - " + vehiculoAsignado.toString();
        }
        return "Disponible";
    }

    @Override
    public String toString() {
        return String.format("Espacio #%d [%s] - %s", numeroEspacio, tipoPermitido, getEstadoTexto());
    }
}
