package deiteiPJCourse.Lab6;

import java.util.Scanner;

public class MinDouble {

    public void printMinDouble() {
        double a; // 1 number
        double b; // 2 number
        double c; // 3 number
        double d; // 4 number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 double");
        a = scanner.nextDouble();
        System.out.println("Enter 2 double");
        b = scanner.nextDouble();
        System.out.println("Enter 3 double");
        c = scanner.nextDouble();
        System.out.println("Enter 4 double");
        d = scanner.nextDouble();
        System.out.println(obtainMinDouble(a,b,c,d));
    }
    public double obtainMinDouble(double a, double b, double c, double d){
        System.out.println("Minimum of 4 double is: ");
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
