package Unit2.Matrices;

import java.util.Scanner;

public class DiagonalMatrixGenerator {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Bienvenido a la tabla bidimensional ***");

        // Creación de la tabla bidimensional (matriz) 5x5
        int[][] diagonal = new int[5][5];
        int tamañoDiagonal = diagonal.length;
        int valorPermitido = 1;

        // Cargar la matriz por teclado con valores (solo la diagonal con unos, el resto
        // quedara con ceros)
        for (int i = 0; i < tamañoDiagonal; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                // Condición para ingresar solo valores a la diagonal principal de la matriz.
                if (i == j) {
                    System.out.print("Ingrese el elemento [" + i + ", " + j + "] de la diagonal: ");
                    diagonal[i][j] = consola.nextInt();

                    // Condición para solo admitir unos
                    if (diagonal[i][j] != valorPermitido) {
                        System.out.print("Por favor solo ingrese el valor 1: ");
                        diagonal[i][j] = consola.nextInt();
                    }
                }
            }
        }

        // Ciclo for para imprimir la tabla
        System.out.println("\nImpresión de la tabla:");
        for (int i = 0; i < tamañoDiagonal; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] + " | ");
            }
            // Salto de linea para que cada fila quede debajo de la otra
            System.out.println();
        }

        consola.close();
    }
}
