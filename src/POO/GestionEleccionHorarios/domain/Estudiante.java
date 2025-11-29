package POO.GestionEleccionHorarios.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase del dominio que representa un estudiante con sus materias inscritas
 */
public class Estudiante {
    private String nombre;
    private String id;
    private List<MateriaInscrita> materiasInscritas;

    /**
     * Constructor de la clase Estudiante
     * 
     * @param nombre Nombre del estudiante
     * @param id     ID único del estudiante
     */
    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materiasInscritas = new ArrayList<>();
    }

    /**
     * Inscribe al estudiante en una materia con un horario específico
     * Verifica que no haya conflictos de horarios antes de inscribir
     * 
     * @param materia Materia a inscribir
     * @param horario Horario seleccionado
     * @throws Exception Si hay un conflicto de horarios o el horario no está
     *                   disponible
     */
    public void inscribirMateria(Materia materia, String horario) throws Exception {
        // Verificar que el horario esté disponible para la materia
        if (!materia.tieneHorario(horario)) {
            throw new Exception(
                    "El horario '" + horario + "' no está disponible para la materia " + materia.getNombre());
        }

        // Verificar que no haya conflicto con materias ya inscritas
        if (tieneConflictoHorario(horario)) {
            throw new Exception("Conflicto de horario: Ya tienes una materia en el horario '" + horario + "'");
        }

        // Inscribir la materia
        MateriaInscrita materiaInscrita = new MateriaInscrita(materia, horario);
        materiasInscritas.add(materiaInscrita);
        System.out.println("✓ Materia inscrita exitosamente: " + materia.getNombre() + " - " + horario);
    }

    /**
     * Verifica si hay un conflicto con el horario propuesto
     * 
     * @param nuevoHorario Horario a verificar
     * @return true si hay conflicto, false en caso contrario
     */
    private boolean tieneConflictoHorario(String nuevoHorario) {
        for (MateriaInscrita mi : materiasInscritas) {
            if (mi.getHorario().equals(nuevoHorario)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra el horario completo del estudiante con todas sus materias inscritas
     */
    public void mostrarHorarioCompleto() {
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║     HORARIO COMPLETO - " + nombre);
        System.out.println("╚════════════════════════════════════════════════════╝");

        if (materiasInscritas.isEmpty()) {
            System.out.println("No tienes materias inscritas.");
        } else {
            System.out.println("\nTotal de créditos: " + getTotalCreditos());
            System.out
                    .println("\n" + String.format("%-10s %-30s %-20s %s", "CÓDIGO", "MATERIA", "HORARIO", "CRÉDITOS"));
            System.out.println("─".repeat(80));

            for (MateriaInscrita mi : materiasInscritas) {
                Materia m = mi.getMateria();
                System.out.println(String.format("%-10s %-30s %-20s %d",
                        m.getCodigo(),
                        m.getNombre(),
                        mi.getHorario(),
                        m.getCreditos()));
            }
        }
        System.out.println();
    }

    /**
     * Calcula el total de créditos inscritos
     * 
     * @return Total de créditos
     */
    private int getTotalCreditos() {
        int total = 0;
        for (MateriaInscrita mi : materiasInscritas) {
            total += mi.getMateria().getCreditos();
        }
        return total;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<MateriaInscrita> getMateriasInscritas() {
        return materiasInscritas;
    }

    /**
     * Clase interna para representar una materia inscrita con su horario
     */
    public static class MateriaInscrita {
        private Materia materia;
        private String horario;

        public MateriaInscrita(Materia materia, String horario) {
            this.materia = materia;
            this.horario = horario;
        }

        public Materia getMateria() {
            return materia;
        }

        public String getHorario() {
            return horario;
        }
    }
}
