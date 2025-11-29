package Unit2.Matrices;

import java.util.Scanner;

public class BorderFrameMatrix {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al marco 5x15 con limites (1) ***");
        Scanner consola = new Scanner(System.in);

        // Declaración de la matriz (5x15)
        int[][] marco = new int[5][15];
        int tamañoVector = marco.length;

        // Inicialización de la matriz con un ciclo for
        for (int i = 0; i < tamañoVector; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                // Si la fila o la columna es la primera o la última, el valor es 1
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1;
                }
            }
        }

        // Ciclo for para imprimir la tabla bidimensional
        System.out.println("---Impresión de la tabla bidimensional---");
        // Valor por defecto del int es 0.
        for (int i = 0; i < tamañoVector; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + " | ");
            }
            // Salto de linea para que cada fila quede debajo de la otra y, no se impriman
            // una al lado de la otra.
            System.out.println();
        }

        consola.close();
    }
}
