package UI;

public class MenuDesign {
    // Códigos ANSI para colores
    public static final String RESET = "\033[0m";
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";

    // Colores en negrita
    public static final String BOLD_RED = "\033[1;31m";
    public static final String BOLD_GREEN = "\033[1;32m";
    public static final String BOLD_YELLOW = "\033[1;33m";
    public static final String BOLD_BLUE = "\033[1;34m";
    public static final String BOLD_PURPLE = "\033[1;35m";
    public static final String BOLD_CYAN = "\033[1;36m";
    public static final String BOLD_WHITE = "\033[1;37m";

    // Símbolos especiales
    public static final String CHECK = "✓";
    public static final String CROSS = "✗";
    public static final String ARROW = "→";
    public static final String STAR = "★";

    /**
     * Limpia la consola
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Imprime un título con formato
     */
    public static void printTitle(String title) {
        int length = title.length();
        String border = "═".repeat(length + 4);

        System.out.println(BOLD_CYAN + "╔" + border + "╗" + RESET);
        System.out.println(BOLD_CYAN + "║  " + BOLD_WHITE + title + BOLD_CYAN + "  ║" + RESET);
        System.out.println(BOLD_CYAN + "╚" + border + "╝" + RESET);
    }

    /**
     * Imprime un separador
     */
    public static void printSeparator() {
        System.out.println(CYAN + "─".repeat(60) + RESET);
    }

    /**
     * Imprime un separador doble
     */
    public static void printDoubleSeparator() {
        System.out.println(CYAN + "═".repeat(60) + RESET);
    }

    /**
     * Imprime un encabezado de sección
     */
    public static void printSectionHeader(String section) {
        System.out.println(BOLD_YELLOW + "\n▼ " + section + RESET);
        printSeparator();
    }

    /**
     * Imprime una opción de menú con formato
     */
    public static void printMenuItem(int number, String text) {
        System.out.printf(GREEN + "%2d" + RESET + " " + CYAN + ARROW + RESET + " %s\n", number, text);
    }

    /**
     * Imprime una opción de menú especial (como salir)
     */
    public static void printSpecialMenuItem(int number, String text) {
        System.out.printf(RED + "%2d" + RESET + " " + RED + ARROW + RESET + " " + BOLD_RED + "%s" + RESET + "\n",
                number, text);
    }

    /**
     * Imprime un mensaje de éxito
     */
    public static void printSuccess(String message) {
        System.out.println(BOLD_GREEN + CHECK + " " + message + RESET);
    }

    /**
     * Imprime un mensaje de error
     */
    public static void printError(String message) {
        System.out.println(BOLD_RED + CROSS + " " + message + RESET);
    }

    /**
     * Imprime un mensaje de información
     */
    public static void printInfo(String message) {
        System.out.println(BOLD_BLUE + "ℹ " + message + RESET);
    }

    /**
     * Imprime un prompt para entrada de usuario
     */
    public static void printPrompt(String message) {
        System.out.print(BOLD_PURPLE + "► " + RESET + message);
    }

    /**
     * Imprime un mensaje de ejecución
     */
    public static void printExecuting(String exercise) {
        System.out.println();
        printDoubleSeparator();
        System.out.println(BOLD_YELLOW + STAR + " Ejecutando: " + BOLD_WHITE + exercise + RESET);
        printDoubleSeparator();
        System.out.println();
    }

    /**
     * Imprime un mensaje de despedida
     */
    public static void printGoodbye() {
        System.out.println();
        printSeparator();
        System.out.println(BOLD_GREEN + "¡Gracias por usar el sistema! Hasta pronto " + STAR + RESET);
        printSeparator();
    }

    /**
     * Pausa la ejecución hasta que el usuario presione Enter
     */
    public static void pause() {
        System.out.println();
        printInfo("Presiona Enter para continuar...");
    }
}
