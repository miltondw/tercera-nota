package Unit2.Arrays;

public class PowerCalculator {
    public static void run() {
        // Definicion y inicializacion del vector
        int[] vectorNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int tamañoVector = vectorNumeros.length;
        double[] valorCuadrado = new double[10];
        double[] valorCubo = new double[10];

        // Utilización de un for para elevar cada valor del vector al cuadrado y luego
        // al cubo
        for (int i = 0; i < tamañoVector; i++) {
            // Utilizamos el metodo "Math.pow" para elevar cada valor al cuadrado y luego al
            // cubo
            // pero se tuvo que almacenar en vectores de tipo double por el mismo método
            valorCuadrado[i] = Math.pow(vectorNumeros[i], 2);
            valorCubo[i] = Math.pow(vectorNumeros[i], 3);
        }

        System.out.println("Los valores del array son: ");
        // Utilizacion de otro ciclo for para imprimir los valores de forma ordenada
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("Valor original del dato número " + (i + 1) + ", es: " + vectorNumeros[i] +
                    ". Elevado al cuadrado: " + valorCuadrado[i] +
                    ". Elevado al cubo: " + valorCubo[i]);
        }
    }
}
