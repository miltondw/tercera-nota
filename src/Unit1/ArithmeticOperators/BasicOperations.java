package Unit1.ArithmeticOperators;

import java.util.Scanner;

/*
 * 
 * Escribe un programa en Java que pida al usuario que introduzca dos números y realice las cinco operaciones aritméticas básicas (suma, resta, multiplicación, división, y módulo), mostrando el resultado de cada una.
 * 
 */
public class BasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
            System.out.println("Módulo: " + (num1 % num2));
        } else {
            System.out.println("División y módulo no definidos para divisor 0.");
        }
        sc.close();
    }
}
