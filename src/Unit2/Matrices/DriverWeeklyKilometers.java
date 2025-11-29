package Unit2.Matrices;

import java.util.Scanner;

public class DriverWeeklyKilometers {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al sistema de transporte ***");

        // Vector para guardar los nombres de los conductores
        String[] nombre = new String[8];
        // Vector para guardar los kilometros que realiza cada conductor diariamente
        float[][] kms = new float[8][7]; // Donde el 7 representa los dias de la semana
                                         // y el 8 representa a la cantidad de conductores.
        int tamañoVector = nombre.length;

        // Vector para guardar el total de kms de cada conductor
        float[] total_kms = new float[8];

        // Ciclo for para inicializar los vectores y darle valores por medio del teclado
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print("Por favor, ingrese el nombre del conductor " + (i + 1) + ": ");
            nombre[i] = consola.nextLine();

            for (int j = 0; j < kms[i].length; j++) {
                System.out.print("Ingrese los kilometros que hizo el conductor " + nombre[i] +
                        " en el día " + (j + 1) + ": ");
                kms[i][j] = consola.nextFloat();
                consola.nextLine(); // Limpiar el buffer

                // Sumar los kilometros diarios (7 dias "j") de cada conductor (8 conductores
                // "i")
                total_kms[i] += kms[i][j];
            }
            System.out.println("------------------------------------------------------------");
        }

        System.out.println("\nEstado final de la semana: ");
        // Ciclo for para hacer la impresión de datos de forma correcta
        for (int i = 0; i < tamañoVector; i++) {
            System.out.printf("El conductor %s, hizo un total de %.2f de kms en la semana",
                    nombre[i], total_kms[i]);
            System.out.println(
                    "\n-----------------------------------------------------------------------------------------------");
        }

        consola.close();
    }
}
