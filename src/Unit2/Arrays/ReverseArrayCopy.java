package Unit2.Arrays;

import java.util.Scanner;

public class ReverseArrayCopy {
    public static void run(Scanner consola) {
        // Para pedir datos por teclado

        // Creacion del vector para las 5 cadenas
        String[] cadenas = new String[5];
        int tamañoVector = cadenas.length;

        // Inicializar el vector
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + " de la cadena: ");
            cadenas[i] = consola.nextLine();
        }

        // Definición del vector que va a copiar los valores del vector original
        String[] copiaCadenas = new String[5];

        // Ciclo for para copiar y cambiar el orden de los valores del vector original
        for (int i = 0; i < tamañoVector; i++) {
            copiaCadenas[i] = cadenas[tamañoVector - 1 - i];
        }

        // Ciclo for para imprimir los vectores
        System.out.println("*** Impresion de los valores del vector original y del vector inverso");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("Valor " + (i + 1) + " del vector original: " + cadenas[i] +
                    " y del vector inverso: " + copiaCadenas[i]);
        }
    }
}
