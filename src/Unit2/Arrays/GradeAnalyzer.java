package Unit2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GradeAnalyzer {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al Sistema de notas ***");

        // Vector para las notas
        int[] notas = new int[5];
        int tamañoNotas = notas.length;

        // Ciclo for para pedir y validar las notas ingresadas por teclado
        System.out.println("Ingrese sus notas (0 - 10) por favor:");
        for (int i = 0; i < tamañoNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = consola.nextInt();

            if (notas[i] >= 0 && notas[i] <= 10) {
                notas[i] = notas[i];
            } else {
                System.out.print("Ingrese una nota valida por favor: ");
                notas[i] = consola.nextInt();
            }
        }

        // Ordenamos el vector de menor a mayor para obtener la nota mas alta, la del
        // medio y la mas baja
        Arrays.sort(notas);

        // Nota más baja, en el indice cero
        int notaBaja = notas[0];
        // Nota más alta, en el indice 4
        int notaAlta = notas[tamañoNotas - 1];
        // Nota de la mitad, en el indice 2
        int notaMedia = notas[2];

        // Impresion de los valores
        System.out.println("Resumen de las notas obtenidas por el estudiante:");
        System.out.println("La nota más alta es: " + notaAlta);
        System.out.println("La nota más baja es: " + notaBaja);
        System.out.println("La nota media es: " + notaMedia);
    }
}
