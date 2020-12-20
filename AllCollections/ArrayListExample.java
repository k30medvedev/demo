package AllCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> arrayList= new ArrayList<String>();

        arrayList.add("Катя");
        arrayList.add("Оля");
        arrayList.add("Аня");
        arrayList.add("Яна");
        arrayList.add("Ната");
        arrayList.add("Ната");
        arrayList.add("Ната");
        arrayList.add("Ната");
        arrayList.add("Ната");
        arrayList.add("Ната");


        arrayList.set(0,"Виктория");
        System.out.println("Размер Arraylist составляет: "+ arrayList.size() + " элементов");
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.toString());
        System.out.println(arrayList.getClass());

        int count = Collections.frequency(arrayList,"Ната");
        System.out.println("Ната числится: " + count + " раз");

        if(arrayList.indexOf("Каракатица") == -1) {
            System.out.println("Ошибка при поиске имени,повторите попытку ввода");
        }

        Collections.sort(arrayList); // Сортировка Arraylist по алфавиту

        for(String temp : arrayList) // Вывод в коносль
            System.out.println(temp);


        String[] names  = arrayList.toArray(new String[0]);  // перегнали в массив
        System.out.println(Arrays.toString(names));

        System.out.println(arrayList.contains("Ната"));

        List<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(51);
        arrayList1.add(14);
        arrayList1.add(11);
        arrayList1.add(12);
        arrayList1.add(31);
        arrayList1.add(21);

        System.out.println(arrayList1);

        arrayList1.removeIf(integer -> (integer > 10 && integer<20));

        System.out.println(arrayList1);







    }
}
