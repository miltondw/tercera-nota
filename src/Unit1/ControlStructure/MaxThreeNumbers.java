package Unit1.ControlStructure;

/*
 * Escribe un programa que lea tres números del usuario y determine cuál es el mayor de los tres utilizando una estructura if-else
 */
import java.util.Scanner;

public class MaxThreeNumbers {
    public static void run(Scanner sc) {
        System.out.println("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int n3 = sc.nextInt();
        int max;
        if (n1 > n2 && n1 > n3) {
            max = n1;
        } else if (n2 > n1 && n2 > n3) {
            max = n2;
        } else {
            max = n3;
        }
        System.out.println("El numero mayor es: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
