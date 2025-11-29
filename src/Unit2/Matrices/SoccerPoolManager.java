package Unit2.Matrices;

import java.util.Scanner;

public class SoccerPoolManager {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al sistema de administración de la quiniela ***");

        // Declaración de un array donde se van a guardar los nombres de los equipos
        // Hay 15 partidos "Representados en las filas" y los nombres de los equipos de
        // cada partido
        // se almacenarán en las columnas
        String[][] equipos = new String[15][2];

        // Declaración de un array donde se almacenarán los resultados de cada partido
        // Las filas serán los partidos jugados y en las columnas se almacenarán los
        // goles que realice cada equipo
        int[][] resultados = new int[15][2];

        // Ciclo for para ingresar los equipos que participan en cada partido
        int tamañoVector = equipos.length;
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("Ingrese los nombres de los equipos que participaron en el partido " + (i + 1) + ": ");
            for (int j = 0; j < equipos[i].length; j++) {
                System.out.print("Equipo 1: ");
                equipos[i][j] = consola.nextLine();
                // Aquí coloqué de nuevo el indice para las columnas para que se vaya
                // desplazando de la posición 0 a la posición 1.
                j++;
                System.out.print("Equipo 2: ");
                equipos[i][j] = consola.nextLine();
            }
        }

        // Declaración de un vector que va a almacenar el equipo ganador de cada partido
        String[] ganadores = new String[15];
        System.out.println("*******************************************************************************");

        // Ciclo for para guardar los goles de cada equipo en cada partido
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("Ingrese los goles de cada equipo en el partido " + (i + 1) + ": ");
            for (int j = 0; j < resultados[i].length; j++) {
                System.out.print("Equipo 1: ");
                resultados[i][j] = consola.nextInt();
                // Aquí coloqué de nuevo el indice para las columnas para que se vaya
                // desplazando de la posición 0 a la posición 1.
                j++;
                System.out.print("Equipo 2: ");
                resultados[i][j] = consola.nextInt();

                // Ciclo if para determinar el equipo ganador de cada partido
                if (resultados[i][j - 1] > resultados[i][j]) {
                    ganadores[i] = equipos[i][j - 1];
                } else if (resultados[i][j - 1] == resultados[i][j]) {
                    ganadores[i] = "Este partido tuvo un empate.";
                } else {
                    ganadores[i] = equipos[i][j];
                }
            }
        }

        // Impresión de los resultados
        System.out.println("\nImpresión de los resultados ");
        System.out.println("\n***********************************************************************");

        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("Resultados del partido " + (i + 1));
            for (int j = 0; j < resultados[i].length; j++) {
                System.out.println("Goles del equipo 1 (" + equipos[i][j] + "): " + resultados[i][j]);
                j++;
                System.out.println("Goles del equipo 2 (" + equipos[i][j] + "): " + resultados[i][j]);

                // Ciclo if para hacer una correcta impresión de los resultados
                if (ganadores[i].equals("Este partido tuvo un empate.")) {
                    System.out.println(ganadores[i]);
                } else {
                    System.out.println("El equipo ganador de este partido es: " + ganadores[i]);
                }
                System.out.println("***************************************************************************+");
            }
        }
    }
}
