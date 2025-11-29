package Unit2.Methods;

public class VariableSwapExample {
    // Creación del metodo para intercambiar variables
    public static void intercambiar(int num1, int num2) {
        int cambiar = num1;
        num1 = num2;
        num2 = cambiar;
        System.out.println("Dentro del metodo, num1 es: " + num1 + " y num2 es: " + num2);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Antes de llamar el metodo, num1 es: " + num1 + " y num2 es: " + num2);
        intercambiar(num1, num2);
        System.out.println("Después de llamar el método, num1 es: " + num1 + " y num2 es: " + num2);
    }
}
