package deiteiPJCourse.lab4;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Введите число");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("Число положительное " + a);
        }
        else{
            System.out.println("Число отрицательное " + a);
        }
    }
}
