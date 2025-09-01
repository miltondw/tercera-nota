import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("\n--- MENÚ DE EJERCICIOS UNIDAD 1 --- \n");
            System.out.println("1. Variables del usuario con los valores asigados");
            System.out.println("2. Ejercico de solicitud de valores al usuario");
            System.out.println("3. Operaciones aritméticas");
            System.out.println("4. Descuento en tienda de ropa");
            System.out.println("5. Retiros bancarios");
            System.out.println("6. Media de tres números");
            System.out.println("7. Comparar si el primero es mayor que el segundo y menor que el tercero");
            System.out.println("0. Salir \n");
            System.out.print("Elige una opción: ");
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println("\n -- Ejecución del Ejericio " + option + " -- \n");
            switch (option) {
                case 1:
                    Unit1.VariableNames.run();
                    break;
                case 2:
                    Unit1.Sistem_IO.VariableNamesV2.run(sc);
                    sc.nextLine();
                    break;
                case 3:
                    Unit1.ArithmeticOperators.BasicOperations.run(sc);
                    sc.nextLine();
                    break;
                case 4:
                    Unit1.ArithmeticOperators.ClothingDiscount.run();
                    sc.nextLine();
                    break;
                case 5:
                    Unit1.ArithmeticOperators.BankWithdrawal.run();
                    sc.nextLine();
                    break;
                case 6:
                    Unit1.Sistem_IO.Media.run(sc);
                    sc.nextLine();
                    break;
                case 7:
                    Unit1.Operators.CompareThreeNumbers.run(sc);
                    sc.nextLine();
                    break;
                case 0:
                    menu = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            
            if (menu) {
                System.out.print("\n¿Deseas ejecutar otro ejercicio? (s/n): ");
                String res = sc.nextLine();
                if (!res.equalsIgnoreCase("s")) {
                    menu = false;
                    System.out.println("¡Hasta luego!");
                }
            }
        }
        sc.close();
    }
}
