package Unit1.Sistem_IO;

/*
 * 
 Proyecto Mini: Desarrollar un programa en Java que calcule la media de tres números introducidos por el usuario y muestre el resultado.
 * 
 */
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int n3 = sc.nextInt();

        double media = (n1 + n2 + n3) / 3.0;

        System.out.printf("La media de los números %d, %d, %d es %.2f\n", n1, n2, n3, media);

        sc.close();
    }
}
