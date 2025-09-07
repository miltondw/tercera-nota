package Unit1.Examples;

public class ControlStructoreInteractive {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("i es " + i);
            i++;
        }

        do {
            System.out.println("i es " + i);
            i++;
        } while (i < 5);
        for (int index = 0; index < 5; index++) {
            System.out.println("i es " + index);
        }
    }

}
