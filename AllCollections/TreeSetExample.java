package AllCollections;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {


        NavigableSet<Cat> myTreeSet = new TreeSet<>();

        myTreeSet.add(new Cat("Abby", 2));
        myTreeSet.add(new Cat("Cinny", 17));
        myTreeSet.add(new Cat("Bunny", 15));
        myTreeSet.add(new Cat("Wild",3));
        myTreeSet.add(new Cat("Xeon",44));


      SortedSet<Cat>  cats = (myTreeSet.headSet(new Cat("Piqqe", 18)));
        System.out.println(cats);
    }
}
