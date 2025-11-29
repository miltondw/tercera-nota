package Unit2.Methods;

public class StringValuePass {
    // Creamos el método para intentar cambiar el valor o contenido de una cadena de
    // texto.
    public static void modificarCadena(String texto) {
        texto = texto + " será un gran ingeniero en Sistemas";
        System.out.println("Dentro del método " + texto);
    }

    public static void main(String[] args) {
        // Creamos una cadena (objeto de tipo cadena)
        String cadena = "Keiner";
        System.out.println("Antes de llamar el método, cadena es : " + cadena);
        // Llamamos el método
        modificarCadena(cadena);
        // Después de llamar el método
        System.out.println("Después de llamar el método, cadena es : " + cadena); // No cambia
    }
}
