package Unit1.ControlStructure;

/*
 * 
 * Desarrolla un programa que calcule el factorial de un número dado por el usuario utilizando un ciclo while.
 */
import java.util.Scanner;

public class FactorialNumber {
    public static void run(Scanner sc) {

        System.out.println("Ingrese el numero: ");
        int n = sc.nextInt();

        int res = 1;
        int i = 1;

        while (i <= n) {
            res *= i;
            i++;
        }
        System.out.printf("El factorial de %d! es %d \n", n, res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
