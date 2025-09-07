package Unit1.ControlStructure;

import java.util.Scanner;

public class CalculatorMenu {
    public static void run(Scanner sc) {
        String[] items = { "Suma", "Resta", "Multiplicación", "División" };
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n** Calculadora **");
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();

            System.out.println("**********");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%d. %s\n", i + 1, items[i]);
            }
            System.out.print("Ingrese la operación a realizar: ");
            int cod = sc.nextInt();

            double res = 0;
            boolean valido = true;

            switch (cod) {
                case 1:
                    res = num1 + num2;
                    break;
                case 2:
                    res = num1 - num2;
                    break;
                case 3:
                    res = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        res = num1 / num2;
                    } else {
                        System.out.println("División no definida para divisor 0.");
                        valido = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    valido = false;
            }

            if (valido) {
                System.out.printf("El resultado es: %.2f\n", res);
            }

            sc.nextLine();
            System.out.print("¿Desea realizar otra operación? (s/n): ");
            String resp = sc.nextLine();
            if (!resp.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("¡Hasta luego!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
