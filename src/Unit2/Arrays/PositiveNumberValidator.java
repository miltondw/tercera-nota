package Unit2.Arrays;

import java.util.Scanner;

public class PositiveNumberValidator {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Bienvenido al sistema de numeros positivos ***");

        int[] numeros = new int[10];
        int tamañoVector = numeros.length;

        // Crear un contador para los datos que se ingresan dentro del vector
        int iteraciones = 0;

        // Ciclo for para llenar el vector
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print("Ingrese el dato entero " + (i + 1) + ": ");
            numeros[i] = consola.nextInt();
            iteraciones++;
            if (numeros[i] < 0) {
                break;
            }
        }

        // Ciclo for para imprimir solo los datos validos
        System.out.println("Impresión de los datos validados:");
        for (int i = 0; i < iteraciones - 1; i++) {
            System.out.println("El valor del dato " + (i + 1) + " es: " + numeros[i]);
        }

        consola.close();
    }
}
