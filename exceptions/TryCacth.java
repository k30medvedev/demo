package core.juja.ExceptionsExamples;

public class TryCacth {
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something wrong ");
        } finally {
            System.out.println("It's finally block ");
        }
    }
}
