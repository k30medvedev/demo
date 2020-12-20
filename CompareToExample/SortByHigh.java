package CompareToExample;

import java.util.Comparator;

public class SortByHigh implements Comparator<Montain> {


        @Override
        public int compare(Montain a, Montain b) {
            return a.getHight().compareTo(b.getHight());
        }
    }


