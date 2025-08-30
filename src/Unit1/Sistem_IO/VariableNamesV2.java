package Unit1.Sistem_IO;

/*
 * 
 * Crea un programa que solicite al usuario su nombre, edad, y altura, y luego muestre un mensaje personalizado que incluya todos esos datos.
 * 
 */
import java.util.Scanner;

public class VariableNamesV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre Completo: ");
        String name = sc.nextLine();

        System.out.print("Género (M/F/O): ");
        char gender = sc.next().charAt(0);

        System.out.print("Edad: ");
        int age = sc.nextInt();

        System.out.print("Altura (en metros): ");
        double height = sc.nextDouble();

        System.out.print("Peso (en kg): ");
        float weight = sc.nextFloat();

        System.out.print("Cantidad de hermanos: ");
        byte siblings = sc.nextByte();

        System.out.print("Año de nacimiento");
        short YEAR_OF_BIRTH = sc.nextShort();

        System.out.print("Numero Teléfono sin prefijo +: ");
        long phoneNumber = sc.nextLong();

        boolean isAdult = age >= 18;

        System.out.printf(
                "¡Hola, %s!\n" +
                        "Aquí está tu información:\n" +
                        "Género: %c\n" +
                        "Edad: %d\n" +
                        "Altura: %.2f m\n" +
                        "¿Eres mayor de edad?: %s\n" +
                        "Cantidad de hermanos: %d\n" +
                        "Año de nacimiento: %d\n" +
                        "Teléfono: %d\n" +
                        "Peso: %.2f kg\n",
                name, gender, age, height, (isAdult ? "sí" : "no"), siblings, YEAR_OF_BIRTH, phoneNumber, weight);

        sc.close();

    }
}
