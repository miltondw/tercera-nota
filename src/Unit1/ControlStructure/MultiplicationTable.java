package Unit1.ControlStructure;

/*
 * Escribe un programa que genere la tabla de multiplicar de un número ingresado por el usuario utilizando un ciclo for.
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void run(Scanner sc) {
        System.out.println("Ingrese el numero de la Tabla de multiplicar: ");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", n, i, (i * n));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
