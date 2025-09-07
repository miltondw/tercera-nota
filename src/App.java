import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        String[] items = {
                "Variables del usuario con los valores asignados",
                "Ejercicio de solicitud de valores al usuario",
                "Operaciones aritméticas",
                "Descuento en tienda de ropa",
                "Retiros bancarios",
                "Media de tres números",
                "Comparar si el primero es mayor que el segundo y menor que el tercero",
                "Ingresar lista de lenguajes de programación",

                "Determinar el Mayor de Tres Números",
                "Contador de Números Pares",
                "Menú Interactivo de caluladora",
                "Factorial de un Número",
                "Tabla de Multiplicar",
                "Salir"
        };
        while (menu) {
            System.out.println("\n=== MENÚ DE EJERCICIOS UNIDAD 1 ===");
            for (int i = 0; i < items.length; i++) {
                System.out.printf("%d. %s\n", i + 1, items[i]);
            }
            System.out.print("Elige una opción: ");
            String input = sc.nextLine();
            int option;
            try {
                option = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Ingresa un número.");
                continue;
            }
            if (option < 1 || option > items.length) {
                System.out.println("Opción fuera de rango. Intenta de nuevo.");
                continue;
            }
            if (option == items.length) {
                menu = false;
                System.out.println("¡Hasta luego!");
                break;
            }
            System.out.println("\n-- Ejecución del Ejercicio: " + items[option - 1] + " --\n");
            switch (option) {
                case 1:
                    Unit1.VariableNames.run();
                    break;
                case 2:
                    Unit1.Sistem_IO.VariableNamesV2.run(sc);
                    sc.nextLine(); // Limpiar buffer después de nextInt, nextDouble, etc.
                    break;
                case 3:
                    Unit1.ArithmeticOperators.BasicOperations.run(sc);
                    sc.nextLine();
                    break;
                case 4:
                    Unit1.ArithmeticOperators.ClothingDiscount.run();
                    break;
                case 5:
                    Unit1.ArithmeticOperators.BankWithdrawal.run();
                    break;
                case 6:
                    Unit1.Sistem_IO.Media.run(sc);
                    sc.nextLine();
                    break;
                case 7:
                    Unit1.Operators.CompareThreeNumbers.run(sc);
                    sc.nextLine();
                    break;
                case 8:
                    Unit1.Loop.ArrayProgramming.run(sc);
                    break;
                case 9:
                    Unit1.ControlStructure.MaxThreeNumbers.run(sc);
                    sc.nextLine();
                    break;
                case 10:
                    Unit1.ControlStructure.EvenNumberCounter.run(sc);
                    break;
                case 11:
                    Unit1.ControlStructure.CalculatorMenu.run(sc);
                    break;
            }
            System.out.print("\n¿Deseas ejecutar otro ejercicio? (s/n): ");
            String res = sc.nextLine();
            if (!res.equalsIgnoreCase("s")) {
                menu = false;
                System.out.println("¡Hasta luego!");
            }
        }
        sc.close();
    }
}
