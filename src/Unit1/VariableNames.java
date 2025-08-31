package Unit1;
/*
 * Ejercicio:
 *  Declara y asigna valores a variables que representen la edad, altura, inicial del nombre, y si una persona es mayor de edad o no.
 */

public class VariableNames {

    public static void run() {
        String name = "Milton Estrada";
        char gender = 'M';
        int age = 23;
        double height = 1.77;
        float weight = 68.5f;
        boolean isAdult = age >= 18;
        byte siblings = 1;
        final short YEAR_OF_BIRTH = 2001;
        long phoneNumber = 573001234567L;

        System.out.println("Nombre: " + name);
        System.out.println("Género: " + gender);
        System.out.println("Edad: " + age);
        System.out.println("Altura: " + height + " m");
        System.out.println("¿Es mayor de edad?: " + (isAdult ? "si" : "no"));
        System.out.println("Cantidad de hermanos: " + siblings);
        System.out.println("Año de nacimiento : " + YEAR_OF_BIRTH);
        System.out.println("Teléfono:  " + phoneNumber);
        System.out.println("Peso: " + weight + " kg");
    }

    public static void main(String[] args) {

        run();
    }
}
