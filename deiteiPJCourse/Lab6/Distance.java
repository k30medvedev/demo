package deiteiPJCourse.Lab6;

import java.util.Scanner;

public class Distance {

    double x1;
    double x2;
    double y1;
    double y2;

    public void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter x1: ");
        x1 = scanner.nextDouble();
        System.out.println("Please Enter x2: ");
        x2 = scanner.nextDouble();
        System.out.println("Please Enter y1: ");
        y1 = scanner.nextDouble();
        System.out.println("Please Enter y2: ");
        y2 = scanner.nextDouble();
        System.out.println("Result is");
        System.out.println(getDistance(x1, x2, y1, y2));
    }

    public double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

}
