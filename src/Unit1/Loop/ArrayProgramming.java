package Unit1.Loop;

import java.util.Scanner;

public class ArrayProgramming {

    public static void run(Scanner sc) {
        String[] ProgrammingLanguages = new String[3];

        for (int i = 0; i < ProgrammingLanguages.length; i++) {
            System.out.printf("Ingrese el %d Lenguaje de progragramación: \n", (i + 1));
            String languages = sc.nextLine();
            ProgrammingLanguages[i] = languages;
        }

        System.out.println("*** Lenguajes de porgramación escojidos ***");
        for (int j = 0; j < ProgrammingLanguages.length; j++) {
            System.out.printf("%d. %s \n", (j + 1), ProgrammingLanguages[j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
