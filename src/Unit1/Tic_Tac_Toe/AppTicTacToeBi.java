package Unit1.Tic_Tac_Toe;

import java.util.Scanner;

public class AppTicTacToeBi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int[][] boardPosition = new int[3][3];
        int position;
        System.out.println("*** New Game ***");
        int count = 0;
        // Players
        char playerX = 'X';
        char playerO = 'O';
        int positionI;
        int positionJ;

        char player = playerX;
        int boardLength = board.length;

        // Mostrar tablero vacío
        System.out.println("*** Tablero de Juego ***");
        for (int i = 0; i < boardLength; i++) {
            for (int j = 0; j < boardLength; j++) {
                board[i][j] = ' ';
                System.out.print("  " + board[i][j] + "  ");
                if (j < boardLength - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < boardLength - 1) {
                System.out.println("-----+-----+-----");
            }

        }
        System.out.println();

        /* Inicio del Tablero de Posiciones */
        System.out.println("*** Posiciones del Tablero ***");
        for (int i = 0; i < boardLength; i++) {
            count++;
            for (int j = 0; j < boardLength; j++) {
                boardPosition[i][j] = count;
                count++;
                System.out.print(" " + boardPosition[i][j] + " ");
                if (j < boardLength - 1) {
                    System.out.print("|");
                }
            }
            count--;
            System.out.println(" ");
            if (i < boardLength - 1) {
                System.out.println("---+---+---");
            }

        }
        /* Fin del Tablero de Posiciones */

        // Bucle principal del juego
        boolean gameActive = true;
        int moves = 0;

        while (gameActive && moves < 9) {
            System.out.println("\nTurno de: " + player);
            System.out.print("*** Ingresa la posición a jugar (1-9): ");
            position = sc.nextInt();

            // Validar posición
            if (position < 1 || position > 9) {
                System.out.println("¡Posición inválida! Debe ser entre 1 y 9.");
                continue;
            }

            // Convertir posición a coordenadas i, j
            positionI = (position - 1) / 3;
            positionJ = (position - 1) % 3;

            // Verificar si la posición está ocupada
            if (board[positionI][positionJ] != ' ') {
                System.out.println("¡Posición ocupada! Intenta otra.");
                continue;
            }

            // Colocar la jugada
            board[positionI][positionJ] = player;
            moves++;

            // Mostrar tablero actualizado
            System.out.println("\n*** Tablero de Juego ***");
            for (int i = 0; i < boardLength; i++) {
                for (int j = 0; j < boardLength; j++) {
                    System.out.print("  " + board[i][j] + "  ");
                    if (j < boardLength - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i < boardLength - 1) {
                    System.out.println("-----+-----+-----");
                }
            }

            // Verificar ganador
            boolean winner = false;

            // Verificar filas
            for (int i = 0; i < boardLength; i++) {
                if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                    winner = true;
                    break;
                }
            }

            // Verificar columnas
            for (int j = 0; j < boardLength; j++) {
                if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                    winner = true;
                    break;
                }
            }

            // Verificar diagonal principal
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                winner = true;
            }

            // Verificar diagonal secundaria
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                winner = true;
            }

            // Si hay ganador, terminar el juego
            if (winner) {
                System.out.println("\n¡¡¡Felicidades!!! El jugador " + player + " ha ganado!");
                gameActive = false;
            } else if (moves == 9) {
                System.out.println("\n¡Empate! El tablero está lleno.");
                gameActive = false;
            } else {
                // Cambiar de jugador
                player = (player == playerX) ? playerO : playerX;
            }
        }

        System.out.println("\n*** Fin del Juego ***");
        sc.close();
    }
}
