package deiteiPJCourse.loops.lab3;

import sun.util.calendar.LocalGregorianCalendar;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("Jonn", "Smitt", 19);
        person.setAge(person.getAge()+ 1 );
        System.out.println(person.getAge());
    }
}
