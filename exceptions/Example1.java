package core.juja.ExceptionsExamples;

public class Example1{
    public static void main(String args[])
    {
        try{
            int num1=30;
            int num2= Integer.parseInt("Error");
            int output = num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("You Shouldn't divide a number by zero");
        }
        catch(NumberFormatException e) {
            System.out.println("Number format exception occurred");
        }
        finally {
            System.out.println("Все идет по плану! ");
        }
    }
}