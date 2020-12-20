package deiteiPJCourse.Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public void getGrades() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please type how many Shudents do you have ? : ");
        int studentsNumber = scanner.nextInt();

        int counter = studentsNumber;
        int max = 0;
        int minimum = 0;
        int average = 0;

        int[] array = new int[counter];


        for (int i = 1; i < counter; i++) {
            System.out.println("Введите балл ученика " + i);
            array[i] = scanner.nextInt();

        }

        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }


}



