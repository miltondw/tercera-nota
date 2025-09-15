package Unit1.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = { 2, 2, 2, 2, 2 };
        int numbersLegth = numbers.length;
        int sum = 0;
        for (int i = 0; i < numbersLegth; i++) {
            sum += numbers[i];
        }
        System.out.println("El promedio es: " + (sum / numbersLegth));
    }
}