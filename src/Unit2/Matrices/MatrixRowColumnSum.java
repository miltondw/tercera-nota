package Unit2.Matrices;

import java.util.Scanner;

public class MatrixRowColumnSum {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido a la tabla bidimensional ***");

        // Creacion de la matriz
        int[][] matriz = new int[5][5];
        int tamañoVector = matriz.length;

        System.out.println("Ingrese los datos de la matriz por favor:");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("Ingrese los datos de la fila " + (i + 1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = consola.nextInt();
            }
        }

        // Realizar las operaciones con los valores ya ingresados en la matriz
        // Para la suma de las filas
        System.out.println("\nSuma de las filas de la matriz:");
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaFilas = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("La suma de la fila " + (j + 1) + " es: " + sumaFilas);
        }

        // Para sumar las columnas
        System.out.println("\nSuma de las columnas de la matriz:");
        for (int i = 0; i < tamañoVector; i++) {
            int sumacolumnas = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumacolumnas += matriz[i][j];
            }
            System.out.println("La suma de la columna " + (i + 1) + " es: " + sumacolumnas);
        }
    }
}
