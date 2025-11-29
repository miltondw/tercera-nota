package POO.GestionEleccionHorarios.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import POO.GestionEleccionHorarios.domain.Estudiante;
import POO.GestionEleccionHorarios.domain.Materia;

/**
 * Servicio principal que gestiona el sistema de horarios
 * Permite registrar materias, estudiantes e inscripciones
 */
public class GestionHorarios {
    private List<Materia> materias;
    private List<Estudiante> estudiantes;

    /**
     * Constructor que inicializa las listas de materias y estudiantes
     */
    public GestionHorarios() {
        this.materias = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    /**
     * Registra una nueva materia en el sistema
     * 
     * @param materia Materia a registrar
     */
    public void registrarMateria(Materia materia) {
        materias.add(materia);
        System.out.println("✓ Materia registrada: " + materia);
    }

    /**
     * Registra un nuevo estudiante en el sistema
     * 
     * @param estudiante Estudiante a registrar
     */
    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("✓ Estudiante registrado: " + estudiante.getNombre() + " (ID: " + estudiante.getId() + ")");
    }

    /**
     * Busca una materia por su código
     * 
     * @param codigo Código de la materia
     * @return Materia encontrada o null si no existe
     */
    public Materia buscarMateria(String codigo) {
        for (Materia m : materias) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                return m;
            }
        }
        return null;
    }

    /**
     * Busca un estudiante por su ID
     * 
     * @param id ID del estudiante
     * @return Estudiante encontrado o null si no existe
     */
    public Estudiante buscarEstudiante(String id) {
        for (Estudiante e : estudiantes) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Muestra todas las materias registradas
     */
    public void mostrarMaterias() {
        System.out.println("\n=== MATERIAS DISPONIBLES ===");
        if (materias.isEmpty()) {
            System.out.println("No hay materias registradas.");
        } else {
            for (Materia m : materias) {
                System.out.println("• " + m);
            }
        }
    }

    /**
     * Muestra todos los estudiantes registrados
     */
    public void mostrarEstudiantes() {
        System.out.println("\n=== ESTUDIANTES REGISTRADOS ===");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante e : estudiantes) {
                System.out.println("• " + e.getNombre() + " - ID: " + e.getId());
            }
        }
    }

    /**
     * Método estático para ejecutar el sistema completo
     * 
     * @param sc Scanner para entrada de datos
     */
    public static void run(Scanner sc) {
        GestionHorarios sistema = new GestionHorarios();

        // Inicializar materias de ejemplo con horarios
        inicializarDatosEjemplo(sistema);

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
                    sistema.mostrarMaterias();
                    break;

                case 2:
                    registrarNuevoEstudiante(sistema, sc);
                    break;

                case 3:
                    inscribirMateriaEstudiante(sistema, sc);
                    break;

                case 4:
                    verHorarioEstudiante(sistema, sc);
                    break;

                case 5:
                    sistema.mostrarEstudiantes();
                    break;

                case 6:
                    System.out.println("\n¡Gracias por usar el sistema de gestión de horarios!");
                    continuar = false;
                    break;

                default:
                    System.out.println("✗ Opción no válida. Intenta de nuevo.");
            }

            if (continuar && opcion != 6) {
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
        System.out.println("║   SISTEMA DE GESTIÓN DE HORARIOS ACADÉMICOS   ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println("1. Ver materias disponibles");
        System.out.println("2. Registrar nuevo estudiante");
        System.out.println("3. Inscribir materia");
        System.out.println("4. Ver horario de estudiante");
        System.out.println("5. Ver estudiantes registrados");
        System.out.println("6. Salir");
        System.out.println("─".repeat(50));
    }

    /**
     * Registra un nuevo estudiante en el sistema
     */
    private static void registrarNuevoEstudiante(GestionHorarios sistema, Scanner sc) {
        System.out.println("\n--- REGISTRO DE ESTUDIANTE ---");
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("ID del estudiante: ");
        String id = sc.nextLine();

        // Verificar que no exista el ID
        if (sistema.buscarEstudiante(id) != null) {
            System.out.println("✗ Error: Ya existe un estudiante con ese ID.");
            return;
        }

        Estudiante estudiante = new Estudiante(nombre, id);
        sistema.registrarEstudiante(estudiante);
    }

    /**
     * Inscribe una materia para un estudiante
     */
    private static void inscribirMateriaEstudiante(GestionHorarios sistema, Scanner sc) {
        System.out.println("\n--- INSCRIPCIÓN DE MATERIA ---");
        System.out.print("ID del estudiante: ");
        String id = sc.nextLine();

        Estudiante estudiante = sistema.buscarEstudiante(id);
        if (estudiante == null) {
            System.out.println("✗ Error: Estudiante no encontrado.");
            return;
        }

        sistema.mostrarMaterias();
        System.out.print("\nCódigo de la materia: ");
        String codigo = sc.nextLine();

        Materia materia = sistema.buscarMateria(codigo);
        if (materia == null) {
            System.out.println("✗ Error: Materia no encontrada.");
            return;
        }

        // Mostrar horarios disponibles
        materia.mostrarHorariosDisponibles();
        System.out.print("\nSelecciona el horario (número): ");

        try {
            int opcionHorario = Integer.parseInt(sc.nextLine().trim());
            List<String> horarios = materia.getHorariosDisponibles();

            if (opcionHorario < 1 || opcionHorario > horarios.size()) {
                System.out.println("✗ Error: Opción de horario inválida.");
                return;
            }

            String horarioSeleccionado = horarios.get(opcionHorario - 1);

            // Intentar inscribir la materia
            estudiante.inscribirMateria(materia, horarioSeleccionado);

        } catch (NumberFormatException e) {
            System.out.println("✗ Error: Ingresa un número válido.");
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }

    /**
     * Muestra el horario completo de un estudiante
     */
    private static void verHorarioEstudiante(GestionHorarios sistema, Scanner sc) {
        System.out.print("\nID del estudiante: ");
        String id = sc.nextLine();

        Estudiante estudiante = sistema.buscarEstudiante(id);
        if (estudiante == null) {
            System.out.println("✗ Error: Estudiante no encontrado.");
            return;
        }

        estudiante.mostrarHorarioCompleto();
    }

    /**
     * Inicializa el sistema con datos de ejemplo
     */
    private static void inicializarDatosEjemplo(GestionHorarios sistema) {
        // Crear materias con sus horarios disponibles
        Materia prog1 = new Materia("Programación I", "PROG101", 4);
        prog1.agregarHorario("Lunes 08:00-10:00");
        prog1.agregarHorario("Martes 14:00-16:00");
        prog1.agregarHorario("Miércoles 10:00-12:00");

        Materia calculo = new Materia("Cálculo Diferencial", "MAT201", 4);
        calculo.agregarHorario("Lunes 10:00-12:00");
        calculo.agregarHorario("Martes 08:00-10:00");
        calculo.agregarHorario("Jueves 14:00-16:00");

        Materia fisica = new Materia("Física I", "FIS101", 3);
        fisica.agregarHorario("Martes 10:00-12:00");
        fisica.agregarHorario("Miércoles 08:00-10:00");
        fisica.agregarHorario("Viernes 10:00-12:00");

        Materia quimica = new Materia("Química General", "QUI101", 3);
        quimica.agregarHorario("Lunes 14:00-16:00");
        quimica.agregarHorario("Miércoles 14:00-16:00");
        quimica.agregarHorario("Viernes 08:00-10:00");

        Materia estructuras = new Materia("Estructuras de Datos", "PROG201", 4);
        estructuras.agregarHorario("Martes 16:00-18:00");
        estructuras.agregarHorario("Jueves 08:00-10:00");
        estructuras.agregarHorario("Viernes 14:00-16:00");

        // Registrar todas las materias en el sistema
        sistema.registrarMateria(prog1);
        sistema.registrarMateria(calculo);
        sistema.registrarMateria(fisica);
        sistema.registrarMateria(quimica);
        sistema.registrarMateria(estructuras);

        System.out.println("\n✓ Sistema inicializado con 5 materias disponibles.");
    }
}
