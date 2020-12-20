package core.juja.ExceptionsExamples;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class A2Test {
    public static void main(String[] args) {
        try {
            A3.divideNumbers(5, Integer.parseInt("N"));
        } catch (ArithmeticException ex1) {
            System.out.println("Divide By Zerol" + ex1.getMessage());

        } catch (NumberFormatException ex2) {
            System.out.println("NumberFormatException"+ ex2.getMessage() +"Reason why:" + ex2.getCause());
        }
    }
}
