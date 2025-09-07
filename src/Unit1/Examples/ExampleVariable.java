package Unit1.Examples;

public class ExampleVariable {
    public static void main(String[] args) {
        // Declaración de variables con buenas prácticas de nombrado
        int studentCount = 25;
        double averageGrade = 87.5;
        String courseName = "Introduction to Java";
        boolean isCourseActive = true;

        // Imprimir los valores de las variables
        System.out.println("Course Name: " + courseName);
        System.out.println("Number of Students: " + studentCount);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Is the Course Active? " + isCourseActive);

        String example = "Java";
        int length = example.length(); // Devuelve 4
        String upperCaseExample = example.toUpperCase(); // Devuelve "JAVA"
        String greeting = "Hello";
        greeting = greeting + " World"; // greeting ahora es "Hello World", pero la cadena original "Hello" sigue
                                        // existiendo
        char a = 'A';
        char b = 'B';
        boolean isEqual2 = (a == b); // Devuelve false
        String str1 = "Java";
        String str2 = "Java";
        boolean isEqual = str1.equals(str2); // Devuelve true
        final double PI = 3.14159;
        final int DIAS_SEMANA = 7;
        final double GRAVEDAD_TIERRA = 9.8;
        final int MAX_EDAD = 120;
        double radio1 = 5;
        double area = 3.14159 * radio1 * radio1;
        double radio = 10;
        double circunferencia = 2 * PI * radio;

    }
}
