package Unit2.Methods;

public class ArrayReferenceModification {
    public static void main(String[] args) {
        int[] arrayEnteros = { 0, 1, 2, 3, 4, 5 };
        int tamañoArray = arrayEnteros.length;

        // Mostramos el contenido del array antes de llamar al método
        System.out.println("Contenido del array antes de llamar el método:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Valor " + i + ", del array es: " + arrayEnteros[i]);
        }

        // Llamamos el método que modifica el contenido del array y le pasamos
        // (arrayEnteros como argumento)
        modificarArray(arrayEnteros);

        // Mostramos el contenido del array después de llamar el metodo
        // (modificarArray).
        System.out.println("\nContenido del Array después de llamar el método:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Valor " + i + ", del array es: " + arrayEnteros[i]);
        }
    }

    // Creamos un método y le pasamos como argumento un array de enteros
    // (arrayEnteros)
    public static void modificarArray(int[] arr) {
        // Modificamos el elemento en el indice 3 y 5 por 0.
        arr[3] = 0;
        arr[5] = 0;
        int tamañoArray = arr.length;

        // Mostramos el contenido del array dentro del método, después de realizar los
        // cambios
        System.out.println("\nContenido del array dentro del método:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println("Valor " + i + ", del array es: " + arr[i]);
        }
    }
}
