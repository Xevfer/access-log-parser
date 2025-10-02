import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int firstNumber = new Scanner (System.in).nextInt();
        System.out.println("Введите второе число");
        int secondNumber = new Scanner (System.in).nextInt();
        double quotient = (double) firstNumber/ secondNumber;
        String a="Сумма:";
        String b="Разность:";
        String c="Произведение:";
        String d="Частное:";
        System.out.println(a+(secondNumber+firstNumber));
        System.out.println(b+(secondNumber-firstNumber));
        System.out.println(c+(secondNumber*firstNumber));
        System.out.println(d+quotient);

    }
}

