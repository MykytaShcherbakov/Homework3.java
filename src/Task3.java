import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму в ЕВРО: ");
        double euro = sc.nextDouble();

        double rate = 1.1084;

        double res = (double) euro * rate;

        System.out.println("Вот сумма перевёдённая в доллары США = " + res);
    }
}
