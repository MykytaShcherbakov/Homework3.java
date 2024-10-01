import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое слово: ");
        String a = sc.nextLine();

        System.out.println("Введите второе слово: ");
        String b = sc.nextLine();

        if (a.length()% 2 == 0 && b.length()% 2 == 0) {
            String firstHalf = a.substring(0, a.length()  / 2);
            String secondHalf = b.substring( b.length()  / 2);
            String res = firstHalf + secondHalf;
            System.out.println("Результат: " + res);
        } else {
            System.out.println("Оба слова должнысостоять из четного количества букв!!!");
        }
    }
}