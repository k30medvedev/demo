package core.juja.A1A8;

public class Outer {
    private String text = "I am Outer private!";

    public class Inner {

        private String text = "I am Inner private";

        public void printText() {
            System.out.println(text);
        }
    }
}
