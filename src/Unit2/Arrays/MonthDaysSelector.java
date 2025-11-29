package Unit2.Arrays;

import java.util.Scanner;

public class MonthDaysSelector {
    public static void run(Scanner consola) {
        System.out.println("*** Bienvenido al Sistema de meses ***");

        // Creacion de los vectores
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        int[] diasMeses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Pedir (datos) numero del mes por teclado
        System.out.print("Por favor, ingrese el número del mes que desea consultar: ");
        int numero = consola.nextInt();

        switch (numero) {
            case 1:
                System.out.println("El mes de " + meses[0] + " tiene " + diasMeses[0] + " días");
                break;
            case 2:
                System.out.println("El mes de " + meses[1] + " tiene " + diasMeses[1] + " días");
                break;
            case 3:
                System.out.println("El mes de " + meses[2] + " tiene " + diasMeses[2] + " días");
                break;
            case 4:
                System.out.println("El mes de " + meses[3] + " tiene " + diasMeses[3] + " días");
                break;
            case 5:
                System.out.println("El mes de " + meses[4] + " tiene " + diasMeses[4] + " días");
                break;
            case 6:
                System.out.println("El mes de " + meses[5] + " tiene " + diasMeses[5] + " días");
                break;
            case 7:
                System.out.println("El mes de " + meses[6] + " tiene " + diasMeses[6] + " días");
                break;
            case 8:
                System.out.println("El mes de " + meses[7] + " tiene " + diasMeses[7] + " días");
                break;
            case 9:
                System.out.println("El mes de " + meses[8] + " tiene " + diasMeses[8] + " días");
                break;
            case 10:
                System.out.println("El mes de " + meses[9] + " tiene " + diasMeses[9] + " días");
                break;
            case 11:
                System.out.println("El mes de " + meses[10] + " tiene " + diasMeses[10] + " días");
                break;
            case 12:
                System.out.println("El mes de " + meses[11] + " tiene " + diasMeses[11] + " días");
                break;
            default:
                System.out.println("Número de mes inválido");
                break;
        }
    }
}
