package Unit1.Operators;

import java.util.Scanner;

/*
 * 
 Crea un programa en Java que solicite al usuario tres números y determine si el primero es mayor que el segundo y menor que el tercero. El programa debe utilizar tanto operadores de comparación como operadores lógicos.
 *
 */

public class CompareThreeNumbers {
    public static void run(Scanner sc) {
        System.out.println("Ingresa el Primer Número a comparar : ");
        int n1 = sc.nextInt();
        System.out.println("Ingresa el Segundo Número a comparar : ");
        int n2 = sc.nextInt();
        System.out.println("Ingresa el Tercer Número a comparar : ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 < n3) {
            System.out.println("El resultado es correcto");
        } else {
            System.out.println("El resultado es incorrecto");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
