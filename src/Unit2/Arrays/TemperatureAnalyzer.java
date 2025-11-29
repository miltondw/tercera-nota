package Unit2.Arrays;

import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al sistema de temperaturas ***");
        System.out.println("__________________________________________________________________");

        // Declaración de los vectores para almacenar las temperaturas
        float[] tempMinima = new float[5];
        float[] tempMaxima = new float[5];
        String[] dias = { "Dia1", "Dia2", "Dia3", "Dia4", "Dia5" };
        // Vector para almacenar las temperaturas medias
        float[] tempMedia = new float[5];
        int tamañoVector = tempMaxima.length;

        // Inicialización de los vectores con un ciclo for
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print("Ingrese la temperatura mínima del " + dias[i] + ": ");
            tempMinima[i] = consola.nextFloat();
            System.out.print("Ingrese la temperatura máxima del " + dias[i] + ": ");
            tempMaxima[i] = consola.nextFloat();

            // Calculamos la temperatura media para cada dia
            tempMedia[i] = (tempMaxima[i] + tempMinima[i]) / 2;
        }

        // Temperatura media de cada dia
        System.out.println("\nTemperaturas medias de cada dia: ");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("La temperatura media del " + dias[i] + " es: " + tempMedia[i]);
        }

        // Determinar los dias con menos temperaturas
        float minGlobal = tempMinima[0];
        String dia = dias[0];

        for (int i = 0; i < tamañoVector; i++) {
            if (tempMinima[i] < minGlobal) {
                minGlobal = tempMinima[i];
                dia = dias[i];
            }
        }

        System.out.println("\nEl dia con la temperatura minima es: " + dia);
        System.out.println("_________________________________________________________");

        // Buscar una temperatura
        System.out.print("Ingrese la temperatura que desea buscar: ");
        float tempBuscada = consola.nextFloat();
        boolean encontrada = false;
        System.out.print("Días con temperatura máxima de " + String.format("%.2f", tempBuscada) + "°C: ");
        boolean primerDiaCoincidente = true;

        for (int i = 0; i < 5; i++) {
            if (tempMaxima[i] == tempBuscada) {
                if (!primerDiaCoincidente) {
                    System.out.print(", ");
                }
                System.out.print(dias[i]);
                encontrada = true;
                primerDiaCoincidente = false;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron días con esa temperatura máxima.");
        } else {
            System.out.println();
        }
    }
}
