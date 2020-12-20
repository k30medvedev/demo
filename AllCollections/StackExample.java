package AllCollections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        passengerProcessing();
    }

private static void passengerProcessing(){

    Stack<Passenger> bus = new Stack<>();
    Passenger passenger = new Passenger("Katerina", "Ivanova");

    bus.push(new Passenger("Alex", "Ivanov"));
    bus.push(new Passenger("Alex", "Smitir"));
    bus.push(new Passenger("Vickor", "Ont"));
    bus.push(new Passenger("Dmitriy", "Pertov"));
    bus.push(passenger);
    bus.push(new Passenger("Ivan", "Ivanov"));

    System.out.println("Last Enter passenger is : " +  bus.peek());

    while (!bus.empty()){
        System.out.println("Passenger:"+ bus.pop() );
    }

    }

public  static class Passenger{
        private static  int number = 1;
        private String name;
        private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Passenger(String name, String surname){
            number ++;
            this.name = name;
            this.surname = surname;
        }

    @Override
    public String toString() {
        return String.format( " " + name + " " + surname);
    }
}







}
