package CompareToExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Comparator<Montain> {


    public int compare(Montain a, Montain b) {
        return a.getName().compareTo(b.getName());

    }

}










