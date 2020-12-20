package core.juja.ExceptionsExamples;

import java.util.Scanner;

public class ThrowExample {

    static void checkAge() {

        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Введите Ваш возраст для продолжения");
        age = scanner.nextInt();
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old ");
        } else {
            System.out.println("Access granted - You are 18.Welcome");
        }

    }
}
