package core.juja.ExceptionsExamples;

public class Checked {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Error e) {
            // nothing
        }
    }
}