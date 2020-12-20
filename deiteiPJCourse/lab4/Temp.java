package deiteiPJCourse.lab4;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        int option;
        double degree = 0;
        double celsiusl;
        double fanhreit;

        Scanner input = new Scanner(System.in);
        option = 0;

        while (option != 3) {

            System.out.println("Chose temperature would you like to convert");
            System.out.println("1:For Celsius to Fanhreit");
            System.out.println("2.For Fahreit to Celsius");
            System.out.println("3.For quit");
            option = input.nextInt();
            if (option == 1) {
                System.out.println("Insert Fanghreit : ");
                degree = input.nextDouble();

                fanhreit = (degree * 9 / 5) + 32;

                System.out.println("Fanhrei" + fanhreit);
            }
            if (option == 2) {
                System.out.println("Insert Fanghreit : ");
                degree = input.nextDouble();
                celsiusl = (degree - 32) * 5 / 9;
                System.out.println("Celsius: " + celsiusl);
            }

            if (option == 3) {
                System.out.println("Программа закрыта");
                break;
            } else {
                System.out.println("Введите верное число");
            }
        }
    }

}
