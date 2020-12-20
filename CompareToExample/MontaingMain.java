package CompareToExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MontaingMain {

    public static void main(String[] args) {

        Montain montain1 = new Montain("Sokka", 1200);
        Montain montain2 = new Montain("A1", 900);
        Montain montain3 = new Montain("Denver", 50000);
        Montain montain4 = new Montain("W2", 200);

        List<Montain> arrayListMontains = new ArrayList<Montain>(); // create arraylist and add montains

        arrayListMontains.add(montain1);
        arrayListMontains.add(montain2);
        arrayListMontains.add(montain3);
        arrayListMontains.add(montain4);


        System.out.println("Sort by date :");
        for (Montain m : arrayListMontains) {
            System.out.println(m.getName() + " " + m.getHight());
        }
        System.out.println("-------------------------------");

        Collections.sort(arrayListMontains, new SortByName()); // так работает сортировка коллекциий
        System.out.println("Sorted by Name:");

        for (Montain m : arrayListMontains) {
            System.out.println(m.getName());
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Sort by hight:");

        Collections.sort(arrayListMontains, new SortByHigh());
        for (Montain m : arrayListMontains) {
            System.out.println(m.getHight());


        }
    }

}

