package core.juja.Set;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> listA = Arrays.asList("A", "B");
        List<Integer> listB = Arrays.asList(1, 2, 3);


        for (Iterator<String> iterA = listA.iterator(); iterA.hasNext(); )
        {
            for (Iterator<Integer> iterB = listB.iterator(); iterB.hasNext(); ) {
                System.out.print(iterA.next() + iterB.next() + " ");
            }
            System.out.println();
        }
    }
}