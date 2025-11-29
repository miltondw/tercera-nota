package Unit2.Matrices;

import java.util.Scanner;

public class UniversityGradeSystem {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al sistema de la universidad ***");

        String[] nombres = new String[5];
        float[] n1 = new float[5];
        float[] n2 = new float[5];
        float[] n3 = new float[5];
        float[] examen = new float[5];
        final int TAMANO_ARRAYS = 5;
        float notaMay = 0;

        // Pedir los datos
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = consola.nextLine();
        }

        System.out.println(".......................................");
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            System.out.print("Ingrese la nota 1 del estudiante " + (i + 1) + ": ");
            n1[i] = consola.nextFloat();
        }

        System.out.println(".......................................");
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            System.out.print("Ingrese la nota 2 del estudiante " + (i + 1) + ": ");
            n2[i] = consola.nextFloat();
        }

        System.out.println(".......................................");
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            System.out.print("Ingrese la nota 3 del estudiante " + (i + 1) + ": ");
            n3[i] = consola.nextFloat();
            if (n3[i] > notaMay) {
                notaMay = n3[i];
            }
        }

        System.out.println(".......................................");
        for (int i = 0; i < TAMANO_ARRAYS; i++) {
            System.out.print("Ingrese la nota del examen del estudiante " + (i + 1) + ": ");
            examen[i] = consola.nextFloat();
        }

        System.out.println("\nNota mayor: " + notaMay);
    }
}
