//package com.company;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class TestConstr {
//
//
//    public static void main(String[] args) {
//
//
//        int[] arraySource = new int[6];
//        arraySource[0] = 0;
//        arraySource[1] = 1;
//        arraySource[2] = 2;
//        arraySource[3] = 3;
//        arraySource[4] = 4;
//        arraySource[5] = 5;
//
//
//        int[] dest = new int[6];
//
//        System.arraycopy(arraySource,2,dest,0,4);
//        System.out.println(Arrays.toString(dest));
//
//    }
//}
////     int result = Sqrt.calculate(5);
////     System.out.println(result);
////
////
////
////     String s1 = "name";
////     s1 = "Tower";
////
////        System.out.println(s1);
////
////
////         Am am = new Am("Kate");
////         am.test();
////
////
////        System.out.println(am.getName());
////
////        Phone call = new Phone();
////        call.call911();
////        call.callToPolice();
////
////
////         final int[] array = new int[10];
////
////         System.out.println(array.length);
////
////        List<Integer> list = new ArrayList<>();
////
////        String[] strings = new String[5];
////        strings[0] = "Ann" ;
////        strings[1] = "1234567" ;
////        strings[2] = "Make" ;
////        strings[3] = "Long" ;
////        strings[4] = "Dmitriedddda" ;
////
////
////
////
////
////        List<String> listString = new ArrayList<>();
////        listString.add("Anna");
////        listString.add("Bob");
////        listString.add("Xon");
////        listString.add("Zen");
////        listString.add("Tor");
////        listString.add("Tim");
////        listString.add("Fop");
////        listString.add("Nanet");
////        listString.add("A");
////        listString.add("BobLoveHelen");
//
//
//
//
//        //
////        listString
////                .stream()
////                .filter(a -> a.startsWith("T"))
////                .forEach(System.out::println);
////
////        listString
////                .stream()
////                .filter()
////                .forEach(System.out::println);
//
////        listString
////                .stream()
////                .sorted(((o1, o2) ->Integer.compare(o1.length(),o2.length())))
////                .forEach(System.out::println);
////
////        fillAll(array);
////        fillList(list);
////
////        // map
////        array = Arrays.stream(array).map(a -> a * 2).toArray();
////        list = list.stream().map(a -> a * 2).collect(Collectors.toList());
////
////        //  map
////        array = Arrays.stream(array).map(a -> a = 3).toArray();
////
////
////        System.out.println(Arrays.toString(array));
////        System.out.println(list);
////
////
////        int[] array2 = new int[10];
////        List<Integer> list2 = new ArrayList<>();
////
////        fillAll(array2);
////        fillList(list2);
////
////        //int sum1 = Arrays.stream(array2).reduce((acc, b) -> acc + b).getAsInt();
////        int sum1 = Arrays.stream(array2).reduce(1, (acc, b) -> acc * b);
////        System.out.println(sum1);
////
////
////
////    }
////
////    private static void fillAll(int[] array) {
////        for (int i = 0; i < 10; i++) {
////            array[i] = (i + 1);
////        }
////    }
////
////    private static void fillList(List<Integer> list) {
////        for (int i = 0; i < 10; i++) {
////            list.add(i + 1);
////        }
////    }
//
//
//
