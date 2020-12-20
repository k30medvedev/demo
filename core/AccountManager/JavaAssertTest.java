package core.juja.AccountManager;

import java.util.Scanner;

public class JavaAssertTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 10");
        int number = scanner.nextInt();

        assert (number>=0 && number <=10) : "Вы ввели не верное число из диапазона: " + number;

        System.out.println("Вы ввели " + number);


    }
}
