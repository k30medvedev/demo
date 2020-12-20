package deiteiPJCourse.Lab6;

import java.util.Scanner;

public class Greeting {

    private int inputNumber; // number by user
    private String greetingString; // greeting to display to user

    public void greeting(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for English Greeting \nEnter 2 to Spanish Greeting");
        inputNumber = scanner.nextInt(); // get int from user

        greet(inputNumber);
        // call method greet to determine need greeting
        System.out.println(greetingString);

    }// end method greeting

    public void greet(int x){

        if(x ==1)
            greetingString = "Hello!"; //English version
        else if (x==2)
            greetingString = "Hola!"; // Spanish version

        else greetingString ="Invalid input"; //Error

    }


}
