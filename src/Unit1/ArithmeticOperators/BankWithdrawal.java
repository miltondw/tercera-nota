package Unit1.ArithmeticOperators;

/*
 * 
 * Una persona tiene una cantidad de dinero en su cuenta bancaria y quiere retirar una cantidad fija cada semana durante un mes. Si la persona tiene inicialmente $1000 en su cuenta y retira $200 cada semana, ¿Cuánto dinero le quedará en su cuenta al final del mes?
 * 
 */
public class BankWithdrawal {
    public static void main(String[] args) {
        double initialBalance = 1000;
        double weeklyWithdrawal = 200;
        int weeks = 4;
        double finalBalance = initialBalance - (weeklyWithdrawal * weeks);

        System.out.println("Saldo inicial: $" + initialBalance);
        System.out.println("Cantidad retirada cada semana: $" + weeklyWithdrawal);
        System.out.println("Semanas: " + weeks);
        System.out.println("Saldo final después de un mes: $" + finalBalance);
    }
}
