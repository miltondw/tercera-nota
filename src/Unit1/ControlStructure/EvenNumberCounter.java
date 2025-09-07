package Unit1.ControlStructure;

/*
 * Crea un programa que cuente cuántos números pares hay entre 1 y 100 utilizando un ciclo for.
 */
import java.util.Scanner;

public class EvenNumberCounter {

    public static void run(Scanner sc) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.printf("Hay %d numeros pares entre 1 y 100 \n", count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
