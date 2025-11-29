package POO.GestionParqueadero.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import POO.GestionParqueadero.domain.EspacioParqueadero;
import POO.GestionParqueadero.domain.Vehiculo;
import POO.GestionParqueadero.domain.Vehiculo.TipoVehiculo;

/**
 * Servicio principal que gestiona el sistema de parqueadero
 * Maneja el registro de vehículos y asignación de espacios
 */
public class GestionParqueadero {
    private List<Vehiculo> vehiculosRegistrados;
    private List<EspacioParqueadero> espacios;

    /**
     * Constructor que inicializa las listas de vehículos y espacios
     */
    public GestionParqueadero() {
        this.vehiculosRegistrados = new ArrayList<>();
        this.espacios = new ArrayList<>();
    }

    /**
     * Registra un nuevo vehículo en el sistema
     * 
     * @param vehiculo Vehículo a registrar
     */
    public void registrarVehiculo(Vehiculo vehiculo) {
        // Verificar que no exista un vehículo con la misma placa
        for (Vehiculo v : vehiculosRegistrados) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                System.out.println("✗ Error: Ya existe un vehículo con la placa " + vehiculo.getPlaca());
                return;
            }
        }

        vehiculosRegistrados.add(vehiculo);
        System.out.println("✓ Vehículo registrado: " + vehiculo);
    }

    /**
     * Crea un espacio de parqueadero
     * 
     * @param numeroEspacio Número del espacio
     * @param tipoPermitido Tipo de vehículo permitido
     */
    public void crearEspacio(int numeroEspacio, TipoVehiculo tipoPermitido) {
        EspacioParqueadero espacio = new EspacioParqueadero(numeroEspacio, tipoPermitido);
        espacios.add(espacio);
    }

    /**
     * Busca un vehículo por su placa
     * 
     * @param placa Placa del vehículo
     * @return Vehículo encontrado o null si no existe
     */
    public Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo v : vehiculosRegistrados) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    /**
     * Busca un espacio por su número
     * 
     * @param numero Número del espacio
     * @return Espacio encontrado o null si no existe
     */
    public EspacioParqueadero buscarEspacio(int numero) {
        for (EspacioParqueadero e : espacios) {
            if (e.getNumeroEspacio() == numero) {
                return e;
            }
        }
        return null;
    }

    /**
     * Muestra todos los espacios disponibles del parqueadero
     */
    public void mostrarEspaciosDisponibles() {
        System.out.println("\n═══ ESPACIOS DISPONIBLES ═══");
        boolean hayDisponibles = false;

        for (EspacioParqueadero espacio : espacios) {
            if (espacio.estaDisponible()) {
                System.out.println("  " + espacio);
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("  No hay espacios disponibles en este momento.");
        }
    }

    /**
     * Muestra todos los espacios del parqueadero (ocupados y disponibles)
     */
    public void mostrarTodosLosEspacios() {
        System.out.println("\n═══ ESTADO DEL PARQUEADERO ═══");

        // Mostrar espacios de carros
        System.out.println("\n--- ESPACIOS PARA CARROS ---");
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.getTipoPermitido() == TipoVehiculo.CARRO) {
                System.out.println("  " + espacio);
            }
        }

        // Mostrar espacios de motos
        System.out.println("\n--- ESPACIOS PARA MOTOS ---");
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.getTipoPermitido() == TipoVehiculo.MOTO) {
                System.out.println("  " + espacio);
            }
        }

        // Mostrar estadísticas
        mostrarEstadisticas();
    }

    /**
     * Muestra estadísticas del parqueadero
     */
    private void mostrarEstadisticas() {
        int totalEspacios = espacios.size();
        int espaciosOcupados = 0;
        int espaciosCarros = 0;
        int espaciosMotos = 0;
        int carrosOcupados = 0;
        int motosOcupadas = 0;

        for (EspacioParqueadero espacio : espacios) {
            if (espacio.getTipoPermitido() == TipoVehiculo.CARRO) {
                espaciosCarros++;
                if (espacio.isOcupado())
                    carrosOcupados++;
            } else {
                espaciosMotos++;
                if (espacio.isOcupado())
                    motosOcupadas++;
            }
            if (espacio.isOcupado())
                espaciosOcupados++;
        }

        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.println("Total de espacios: " + totalEspacios);
        System.out.println(
                "Espacios ocupados: " + espaciosOcupados + " | Disponibles: " + (totalEspacios - espaciosOcupados));
        System.out.println("Carros: " + carrosOcupados + "/" + espaciosCarros + " | Motos: " + motosOcupadas + "/"
                + espaciosMotos);
    }

    /**
     * Muestra todos los vehículos registrados
     */
    public void mostrarVehiculosRegistrados() {
        System.out.println("\n═══ VEHÍCULOS REGISTRADOS ═══");
        if (vehiculosRegistrados.isEmpty()) {
            System.out.println("  No hay vehículos registrados.");
        } else {
            for (Vehiculo v : vehiculosRegistrados) {
                System.out.println("  • " + v);
            }
        }
    }

    /**
     * Método estático para ejecutar el sistema completo
     * 
     * @param sc Scanner para entrada de datos
     */
    public static void run(Scanner sc) {
        GestionParqueadero sistema = new GestionParqueadero();

        // Inicializar espacios del parqueadero
        inicializarEspacios(sistema);

        boolean continuar = true;

        while (continuar) {
            mostrarMenuPrincipal();
            System.out.print("Selecciona una opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("✗ Opción inválida. Ingresa un número.");
                continue;
            }

            switch (opcion) {
                case 1:
                    registrarNuevoVehiculo(sistema, sc);
                    break;

                case 2:
                    sistema.mostrarVehiculosRegistrados();
                    break;

                case 3:
                    sistema.mostrarEspaciosDisponibles();
                    break;

                case 4:
                    sistema.mostrarTodosLosEspacios();
                    break;

                case 5:
                    asignarEspacio(sistema, sc);
                    break;

                case 6:
                    liberarEspacio(sistema, sc);
                    break;

                case 7:
                    System.out.println("\n¡Gracias por usar el sistema de gestión de parqueadero!");
                    continuar = false;
                    break;

                default:
                    System.out.println("✗ Opción no válida. Intenta de nuevo.");
            }

            if (continuar && opcion != 7) {
                System.out.print("\nPresiona Enter para continuar...");
                try {
                    sc.nextLine();
                } catch (Exception e) {
                    // Si no hay más líneas disponibles, continuar
                }
            }
        }
    }

    /**
     * Muestra el menú principal del sistema
     */
    private static void mostrarMenuPrincipal() {
        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE GESTIÓN DE PARQUEADERO         ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println("1. Registrar vehículo");
        System.out.println("2. Ver vehículos registrados");
        System.out.println("3. Ver espacios disponibles");
        System.out.println("4. Ver estado del parqueadero");
        System.out.println("5. Asignar espacio a vehículo");
        System.out.println("6. Liberar espacio");
        System.out.println("7. Salir");
        System.out.println("─".repeat(50));
    }

    /**
     * Registra un nuevo vehículo en el sistema
     */
    private static void registrarNuevoVehiculo(GestionParqueadero sistema, Scanner sc) {
        System.out.println("\n--- REGISTRO DE VEHÍCULO ---");
        System.out.print("Placa del vehículo: ");
        String placa = sc.nextLine().trim();

        if (placa.isEmpty()) {
            System.out.println("✗ Error: La placa no puede estar vacía.");
            return;
        }

        System.out.print("Tipo de vehículo (1=CARRO, 2=MOTO): ");
        int tipoOpcion;
        try {
            tipoOpcion = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("✗ Error: Ingresa un número válido.");
            return;
        }

        TipoVehiculo tipo;
        if (tipoOpcion == 1) {
            tipo = TipoVehiculo.CARRO;
        } else if (tipoOpcion == 2) {
            tipo = TipoVehiculo.MOTO;
        } else {
            System.out.println("✗ Error: Opción de tipo inválida.");
            return;
        }

        System.out.print("Nombre del propietario: ");
        String propietario = sc.nextLine().trim();

        if (propietario.isEmpty()) {
            System.out.println("✗ Error: El nombre del propietario no puede estar vacío.");
            return;
        }

        Vehiculo vehiculo = new Vehiculo(placa, tipo, propietario);
        sistema.registrarVehiculo(vehiculo);
    }

    /**
     * Asigna un espacio a un vehículo
     */
    private static void asignarEspacio(GestionParqueadero sistema, Scanner sc) {
        System.out.println("\n--- ASIGNACIÓN DE ESPACIO ---");
        System.out.print("Placa del vehículo: ");
        String placa = sc.nextLine().trim();

        Vehiculo vehiculo = sistema.buscarVehiculo(placa);
        if (vehiculo == null) {
            System.out.println("✗ Error: Vehículo no encontrado. Debe registrarlo primero.");
            return;
        }

        // Mostrar espacios disponibles del tipo correcto
        System.out.println("\nEspacios disponibles para " + vehiculo.getTipo() + ":");
        boolean hayDisponibles = false;
        for (EspacioParqueadero espacio : sistema.espacios) {
            if (espacio.estaDisponible() && espacio.getTipoPermitido() == vehiculo.getTipo()) {
                System.out.println("  " + espacio);
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("  No hay espacios disponibles para este tipo de vehículo.");
            return;
        }

        System.out.print("\nNúmero del espacio a asignar: ");
        int numeroEspacio;
        try {
            numeroEspacio = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("✗ Error: Ingresa un número válido.");
            return;
        }

        EspacioParqueadero espacio = sistema.buscarEspacio(numeroEspacio);
        if (espacio == null) {
            System.out.println("✗ Error: Espacio no encontrado.");
            return;
        }

        try {
            espacio.asignarVehiculo(vehiculo);
            System.out.println("✓ Espacio asignado exitosamente:");
            System.out.println("  " + espacio);
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }

    /**
     * Libera un espacio ocupado
     */
    private static void liberarEspacio(GestionParqueadero sistema, Scanner sc) {
        System.out.println("\n--- LIBERACIÓN DE ESPACIO ---");
        System.out.print("Número del espacio a liberar: ");

        int numeroEspacio;
        try {
            numeroEspacio = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("✗ Error: Ingresa un número válido.");
            return;
        }

        EspacioParqueadero espacio = sistema.buscarEspacio(numeroEspacio);
        if (espacio == null) {
            System.out.println("✗ Error: Espacio no encontrado.");
            return;
        }

        if (!espacio.isOcupado()) {
            System.out.println("✗ Error: El espacio ya está disponible.");
            return;
        }

        System.out.println("Liberando: " + espacio);
        espacio.liberarEspacio();
        System.out.println("✓ Espacio liberado exitosamente.");
    }

    /**
     * Inicializa los espacios del parqueadero
     */
    private static void inicializarEspacios(GestionParqueadero sistema) {
        // Crear 10 espacios para carros (números 1-10)
        for (int i = 1; i <= 10; i++) {
            sistema.crearEspacio(i, TipoVehiculo.CARRO);
        }

        // Crear 15 espacios para motos (números 101-115)
        for (int i = 101; i <= 115; i++) {
            sistema.crearEspacio(i, TipoVehiculo.MOTO);
        }

        System.out.println("\n✓ Parqueadero inicializado:");
        System.out.println("  • 10 espacios para carros (1-10)");
        System.out.println("  • 15 espacios para motos (101-115)");
    }
}
