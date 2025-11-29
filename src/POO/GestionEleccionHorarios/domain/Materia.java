package POO.GestionEleccionHorarios.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase del dominio que representa una materia con sus horarios disponibles
 */
public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private List<String> horariosDisponibles;

    /**
     * Constructor de la clase Materia
     * 
     * @param nombre   Nombre de la materia
     * @param codigo   Código único de la materia
     * @param creditos Número de créditos
     */
    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horariosDisponibles = new ArrayList<>();
    }

    /**
     * Agrega un nuevo horario a la lista de horarios disponibles
     * 
     * @param horario Horario en formato "Día HH:MM-HH:MM" (ej: "Lunes 08:00-10:00")
     */
    public void agregarHorario(String horario) {
        if (!horariosDisponibles.contains(horario)) {
            horariosDisponibles.add(horario);
        }
    }

    /**
     * Muestra todos los horarios disponibles para esta materia
     */
    public void mostrarHorariosDisponibles() {
        System.out.println("\n--- Horarios disponibles para " + nombre + " ---");
        if (horariosDisponibles.isEmpty()) {
            System.out.println("No hay horarios disponibles.");
        } else {
            for (int i = 0; i < horariosDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + horariosDisponibles.get(i));
            }
        }
    }

    /**
     * Verifica si un horario específico está disponible para esta materia
     * 
     * @param horario Horario a verificar
     * @return true si el horario está disponible, false en caso contrario
     */
    public boolean tieneHorario(String horario) {
        return horariosDisponibles.contains(horario);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public List<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + creditos + " créditos)";
    }
}
