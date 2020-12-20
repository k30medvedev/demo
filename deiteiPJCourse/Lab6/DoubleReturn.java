package deiteiPJCourse.Lab6;

import java.util.Scanner;

public class DoubleReturn {

    double one =0;
    double two =0;
    public void printDifference(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter One: ");
        one = scanner.nextDouble();
        System.out.println("Please Enter Two: ");
        one = scanner.nextDouble();

        System.out.println("Result divide:");
        System.out.println(difference(one,two));
    }

    public double difference(double one, double two) {
        return one - two;
    }

}
