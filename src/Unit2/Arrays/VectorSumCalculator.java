package Unit2.Arrays;

import java.util.Scanner;

public class VectorSumCalculator {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al Sistema de suma de vectores ***");

        // Declaración de los tres vectores
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        int tamañoVector = vector1.length;

        // Inicialización del vector 1 y 2 por medio de un ciclo for con datos
        // ingresados por teclado
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print("Por favor, ingrese el dato " + (i + 1) + " del vector 1: ");
            vector1[i] = consola.nextInt();
            System.out.print("Por favor, ingrese el dato " + (i + 1) + " del vector 2: ");
            vector2[i] = consola.nextInt();

            // Realizamos la suma de los dos vectores y los guardamos en el vector 3
            vector3[i] = vector1[i] + vector2[i];
        }

        // Imprimimos los resultados de cada una de celdas del vector con un ciclo for
        System.out.println("------------------------------------------------------------------");
        System.out.println("Resultados de la suma del vector 1 y del vector 2");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("El resultado de la suma de la columna " + (i + 1) +
                    " del vector 1 y el vector 2 es: " + vector3[i]);
        }
    }
}
