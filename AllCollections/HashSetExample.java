package AllCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {


        List<Cat> myArray = new ArrayList();
        myArray.add(new Cat("Василий", 2));
        myArray.add(new Cat("Шарик", 5));
        myArray.add(new Cat("Барсик", 1));
        myArray.add(new Cat("Ник", 12));
        myArray.add(new Cat("Хелен", 3));
        myArray.add(new Cat("Хелен", 3));

        for( Cat temp : myArray){
            System.out.println(temp);
        }

        System.out.println("After copy collection");
        System.out.println("_______________________");

        Set<Cat> myHashSet = new HashSet<Cat>();
        myHashSet.addAll(myArray);
        for( Cat temp : myHashSet){
            System.out.println(temp);
        }
    }

}
