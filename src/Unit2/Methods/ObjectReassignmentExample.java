package Unit2.Methods;

class Persona {
    // Creacion del atributo nombre dentro de la clase Persona
    String nombre;
}

public class ObjectReassignmentExample {
    // Dentro del metodo principal (Main)
    public static void main(String[] args) {
        // Creacion del objeto
        Persona persona = new Persona();
        persona.nombre = "Miryian";

        // Imprimimos el objeto antes de modificarlo
        System.out.println("Objeto antes de modificar (objeto original): " + persona.nombre);

        // Llamamos el metodo y le pasamos el argumento persona al parametro de entrada
        reasignarPersona(persona);
        System.out.println("Nombre después de reasignarPersona: " + persona.nombre);
    }

    public static void reasignarPersona(Persona persona) {
        // Creacion de un nuevo objeto local al metodo (reasignarPersona)
        persona = new Persona();
        persona.nombre = "Maibel";
    }
}
