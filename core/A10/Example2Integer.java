package core.juja.A10;

public class Example2Integer {

    public static void main(String[] args) {

        String strng = "123";
        Integer i1 = Integer.valueOf(strng);

        Integer i0 = Integer.valueOf(100);

        System.out.println(i1.toString() + i1.getClass());

        int int1 = Integer.parseInt(strng);

        System.out.println(i0 + " " + i1+ " " + int1);
    }
}
