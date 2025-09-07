package Unit1.Examples;

import java.util.Scanner;

public class ExampleScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int resultado = numero + 10;
        System.out.println("El resultado es: " + resultado);
        sc.close();
    }

}
