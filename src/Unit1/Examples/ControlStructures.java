package Unit1.Examples;

public class ControlStructures {
    public static void main(String[] args) {
        int numero = 10;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        }
        numero = -5;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo o cero.");
        }

        numero = 0;
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }
    }
}
