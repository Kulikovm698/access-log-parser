import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = in.nextInt();

        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
        System.out.println("Разность чисел: " + (firstNumber - secondNumber));
        System.out.println("Произведение чисел: " + (firstNumber * secondNumber));
        System.out.println("Частное чисел: " + quotient);

    }

}
