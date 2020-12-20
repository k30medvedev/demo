package CompareToExample;

import java.util.*;

public class SongTest {
    public static void main(String[] args) {

        Song song = new Song("n");
        Song song2 = new Song("b");
        Song song3 = new Song("w");
        Song song4 = new Song("d");

        List<Song> arrayList = new ArrayList<Song>();
        arrayList.add(song);
        arrayList.add(song2);
        arrayList.add(song3);
        arrayList.add(song4);


        Collections.sort(arrayList);

        for(Song temp : arrayList){
            System.out.println( temp.getTitle());

        }




    }
}
