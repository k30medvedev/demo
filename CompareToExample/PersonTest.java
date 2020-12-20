package CompareToExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {


        Person p1  = new Person("Kate");
        Person p2  = new Person("Olga");
        Person p3  = new Person("Vika");
        Person p4  = new Person("Anna");


        List<Person> arraylist = new ArrayList<Person>();

        arraylist.add(p1);
        arraylist.add(p2);
        arraylist.add(p3);
        arraylist.add(p4);

        System.out.println("Before compare");
        for(Person  p : arraylist){

            System.out.println(p.getName());
        }
        Collections.sort(arraylist);
        System.out.println("After compare");
        System.out.println("---------------------------");

        for(Person  p : arraylist){

            System.out.println(p.getName());
        }



    }
}
