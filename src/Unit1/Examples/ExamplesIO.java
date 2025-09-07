package Unit1.Examples;

import java.util.Scanner;

public class ExamplesIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }

    public static void example1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("Número entero leído: " + numero);
    }

    public class LeerDecimal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número decimal: ");
            double decimal = scanner.nextDouble();

            System.out.println("Número decimal leído: " + decimal);
        }
    }

    public static void example2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una línea de texto: ");
        String linea = scanner.nextLine();

        System.out.println("Línea de texto leída: " + linea);
    }

    public class LeerPalabra {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa una palabra: ");
            String palabra = scanner.next();

            System.out.println("Palabra leída: " + palabra);
        }
    }

    // Salida de Datos
    public class InnerExamplesIO {
        public static void main(String[] args) {
            System.out.println("Hola, Mundo!");
            System.out.print("Hola, ");
            System.out.print("Mundo!");
            // Output: Hola, Mundo!
            System.out.printf("El precio es %.2f dólares", 12.3456);
            // Output: El precio es 12.35 dólares
        }
    }

    public class example4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese su altura en metros: ");
            double altura = scanner.nextDouble();

            System.out.println("Hola, " + nombre + ". Tienes " + edad + " años y mides " + altura + " metros.");
        }
    }
}
