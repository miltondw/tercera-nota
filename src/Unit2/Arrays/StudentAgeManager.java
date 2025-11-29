package Unit2.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAgeManager {
    public static void run(Scanner consola) {

        // Declaración de los vectores
        ArrayList<String> nombresEstudiantes = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        ArrayList<String> estudiantesMayoresEdad = new ArrayList<>();
        ArrayList<String> masMayor = new ArrayList<>();
        int edadMinima = 18;

        // Ciclo for para pedir los datos y al mismo tiempo validarlos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + " (o '*' para terminar): ");
            String nombre = consola.nextLine();

            if (!nombre.equals("*")) {
                nombresEstudiantes.add(nombre);
                System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
                int edadIndividual = consola.nextInt();
                edades.add(edadIndividual);
                consola.nextLine(); // Limpiar buffer
            } else {
                break;
            }
        }

        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= edadMinima) {
                estudiantesMayoresEdad.add(nombresEstudiantes.get(i));
            }
            if (edades.get(i) > 18) {
                masMayor.add(nombresEstudiantes.get(i));
            }
        }

        System.out.println("Estudiantes mayores de edad: " + estudiantesMayoresEdad);
        System.out.println("Estudiantes con más de 18: " + masMayor);
    }
}
