package deiteiPJCourse.lab4;

import java.util.Scanner;

public class Palindrom{
    public static void main(String[] args) {
//           int one = 5;
//           int two = 4;
//           int three=3;
//           int four =4;
//           int five = 5;
//
//
//           int[] array = new int[5];
//           array[0] = one;
//           array[1] = two;
//           array[2] = three;
//           array[3] = four;
//           array[4] = five;
//
//           if(array[0]==array[4] & array[1]==array[3]){
//               System.out.println("This is Palindorom");
//           }
//               else
//           {
//               System.out.println("not");
//           }
        boolean IN = false;
        while (!IN) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            int a = scanner.nextInt();
            StringBuilder s = new StringBuilder();
            System.out.println(a);
            while (a > 0) {
                s.insert(0, a % 10);
                a = a / 10;
            }
            //int first =  Character.digit(s.charAt(0),10);
            if (s.length() == 5) {
                if (s.charAt(0) == s.charAt(4) & s.charAt(1) == s.charAt(3)) {
                    IN = true;
                    System.out.println("This is palinnrom");
                } else {
                    System.out.println("Not a palinrom");
                }
            } else {
                System.out.println("Превышено количество цифр в числе,должно быть 5: ");
            }
            ;
            //System.out.println(first);
        }
    }
}
