import java.util.Scanner;
import UI.MenuDesign;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;

        // Ejercicios de la Unidad 1
        String[] unit1Items = {
                "Variables del usuario con los valores asignados",
                "Ejercicio de solicitud de valores al usuario",
                "Operaciones aritméticas",
                "Descuento en tienda de ropa",
                "Retiros bancarios",
                "Media de tres números",
                "Comparar si el primero es mayor que el segundo y menor que el tercero",
                "Ingresar lista de lenguajes de programación",
                "Determinar el Mayor de Tres Números",
                "Contador de Números Pares",
                "Menú Interactivo de calculadora",
                "Factorial de un Número",
                "Tabla de Multiplicar"
        };

        // Ejercicios de la Unidad 2 - Arrays
        String[] unit2ArrayItems = {
                "Calculadora de Potencias (Cuadrado y Cubo)",
                "Copia Inversa de Array",
                "Analizador de Notas",
                "Validador de Números Positivos",
                "Ordenador de Arrays",
                "Selector de Días del Mes",
                "Calculadora de Suma de Vectores",
                "Gestor de Edad de Estudiantes",
                "Analizador de Temperaturas"
        };

        // Ejercicios de la Unidad 2 - Matrices
        String[] unit2MatrixItems = {
                "Suma de Filas y Columnas de Matriz",
                "Generador de Matriz Diagonal",
                "Matriz con Marco de Bordes",
                "Kilómetros Semanales de Conductores",
                "Sistema de Gestión de Inventario",
                "Administrador de Quiniela de Fútbol",
                "Sistema de Notas Universitarias"
        };

        // Ejercicios de POO
        String[] pooItems = {
                "Gestión de Elección de Horarios"
        };

        while (menu) {
            MenuDesign.clearScreen();
            MenuDesign.printTitle("SISTEMA DE EJERCICIOS DE PROGRAMACIÓN");

            System.out.println();
            MenuDesign.printSectionHeader("UNIDAD 1 - Fundamentos");
            for (int i = 0; i < unit1Items.length; i++) {
                MenuDesign.printMenuItem(i + 1, unit1Items[i]);
            }

            int unit2Start = unit1Items.length + 1;
            MenuDesign.printSectionHeader("UNIDAD 2 - Arrays");
            for (int i = 0; i < unit2ArrayItems.length; i++) {
                MenuDesign.printMenuItem(unit2Start + i, unit2ArrayItems[i]);
            }

            int unit2MatrixStart = unit2Start + unit2ArrayItems.length;
            MenuDesign.printSectionHeader("UNIDAD 2 - Matrices");
            for (int i = 0; i < unit2MatrixItems.length; i++) {
                MenuDesign.printMenuItem(unit2MatrixStart + i, unit2MatrixItems[i]);
            }

            int pooStart = unit2MatrixStart + unit2MatrixItems.length;
            MenuDesign.printSectionHeader("POO - Programación Orientada a Objetos");
            for (int i = 0; i < pooItems.length; i++) {
                MenuDesign.printMenuItem(pooStart + i, pooItems[i]);
            }

            System.out.println();
            int totalOptions = unit1Items.length + unit2ArrayItems.length + unit2MatrixItems.length + pooItems.length
                    + 1;
            MenuDesign.printSpecialMenuItem(totalOptions, "Salir");

            System.out.println();
            MenuDesign.printDoubleSeparator();
            MenuDesign.printPrompt("Elige una opción: ");

            String input = sc.nextLine();
            int option;

            try {
                option = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                MenuDesign.printError("Opción inválida. Ingresa un número.");
                MenuDesign.pause();
                sc.nextLine();
                continue;
            }

            if (option < 1 || option > totalOptions) {
                MenuDesign.printError("Opción fuera de rango. Intenta de nuevo.");
                MenuDesign.pause();
                sc.nextLine();
                continue;
            }

            if (option == totalOptions) {
                menu = false;
                MenuDesign.printGoodbye();
                break;
            }

            // Determinar qué ejercicio ejecutar
            String exerciseName = "";
            if (option <= unit1Items.length) {
                exerciseName = unit1Items[option - 1];
            } else if (option <= unit1Items.length + unit2ArrayItems.length) {
                exerciseName = unit2ArrayItems[option - unit1Items.length - 1];
            } else if (option <= unit1Items.length + unit2ArrayItems.length + unit2MatrixItems.length) {
                exerciseName = unit2MatrixItems[option - unit1Items.length - unit2ArrayItems.length - 1];
            } else {
                exerciseName = pooItems[option - unit1Items.length - unit2ArrayItems.length - unit2MatrixItems.length
                        - 1];
            }

            MenuDesign.printExecuting(exerciseName);

            switch (option) {
                // ========== UNIDAD 1 ==========
                case 1:
                    Unit1.VariableNames.run();
                    break;
                case 2:
                    Unit1.Sistem_IO.VariableNamesV2.run(sc);
                    sc.nextLine();
                    break;
                case 3:
                    Unit1.ArithmeticOperators.BasicOperations.run(sc);
                    sc.nextLine();
                    break;
                case 4:
                    Unit1.ArithmeticOperators.ClothingDiscount.run();
                    break;
                case 5:
                    Unit1.ArithmeticOperators.BankWithdrawal.run();
                    break;
                case 6:
                    Unit1.Sistem_IO.Media.run(sc);
                    sc.nextLine();
                    break;
                case 7:
                    Unit1.Operators.CompareThreeNumbers.run(sc);
                    sc.nextLine();
                    break;
                case 8:
                    Unit1.Loop.ArrayProgramming.run(sc);
                    break;
                case 9:
                    Unit1.ControlStructure.MaxThreeNumbers.run(sc);
                    sc.nextLine();
                    break;
                case 10:
                    Unit1.ControlStructure.EvenNumberCounter.run(sc);
                    break;
                case 11:
                    Unit1.ControlStructure.CalculatorMenu.run(sc);
                    break;
                case 12:
                    Unit1.ControlStructure.FactorialNumber.run(sc);
                    sc.nextLine();
                    break;
                case 13:
                    Unit1.ControlStructure.MultiplicationTable.run(sc);
                    sc.nextLine();
                    break;

                // ========== UNIDAD 2 - ARRAYS ==========
                case 14:
                    Unit2.Arrays.PowerCalculator.run();
                    break;
                case 15:
                    Unit2.Arrays.ReverseArrayCopy.run(sc);
                    break;
                case 16:
                    Unit2.Arrays.GradeAnalyzer.run(sc);
                    break;
                case 17:
                    Unit2.Arrays.PositiveNumberValidator.run(sc);
                    break;
                case 18:
                    Unit2.Arrays.ArraySorter.run();
                    break;
                case 19:
                    Unit2.Arrays.MonthDaysSelector.run(sc);
                    break;
                case 20:
                    Unit2.Arrays.VectorSumCalculator.run(sc);
                    break;
                case 21:
                    Unit2.Arrays.StudentAgeManager.run(sc);
                    break;
                case 22:
                    Unit2.Arrays.TemperatureAnalyzer.run(sc);
                    break;

                // ========== UNIDAD 2 - MATRICES ==========
                case 23:
                    Unit2.Matrices.MatrixRowColumnSum.run(sc);
                    break;
                case 24:
                    Unit2.Matrices.DiagonalMatrixGenerator.run(sc);
                    break;
                case 25:
                    Unit2.Matrices.BorderFrameMatrix.run();
                    break;
                case 26:
                    Unit2.Matrices.DriverWeeklyKilometers.run(sc);
                    break;
                case 27:
                    Unit2.Matrices.InventoryManagementSystem.run(sc);
                    break;
                case 28:
                    Unit2.Matrices.SoccerPoolManager.run(sc);
                    break;
                case 29:
                    Unit2.Matrices.UniversityGradeSystem.run(sc);
                    break;

                // ========== POO ==========
                case 30:
                    POO.GestionEleccionHorarios.services.GestionHorarios.run(sc);
                    break;
            }

            System.out.println();
            MenuDesign.printDoubleSeparator();
            MenuDesign.printPrompt("¿Deseas ejecutar otro ejercicio? (s/n): ");

            String res = sc.nextLine();
            if (!res.equalsIgnoreCase("s")) {
                menu = false;
                MenuDesign.printGoodbye();
            }
        }
        sc.close();
    }
}
