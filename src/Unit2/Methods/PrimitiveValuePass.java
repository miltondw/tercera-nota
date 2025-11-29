package Unit2.Methods;

public class PrimitiveValuePass {
    public static void main(String[] args) {
        // Aquí hay un paso por valor porque solo se utilizan tipos de datos primitivos
        // mas no se utiliza objetos
        int numero = 5;
        cambiarValor(numero);
        System.out.println("Después de llamar a cambiarValor: " + numero); // Imprime 5
    }

    public static void cambiarValor(int num) {
        num = 10;
        System.out.println("Dentro de cambiarValor: " + num); // Imprime 10
    }
}
