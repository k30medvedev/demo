package core.juja.A10;

import java.math.BigInteger;

public class BitInteger {
    public static void main(String[] args) {

        // BigInteger object to store the result
        BigInteger result;

        // For user input
        // Use Scanner or BufferedReader

        // Two objects of String created
        // Holds the values to calculate gcd
        String input1 = "54";
        String input2 = "42";

        // Creating two BigInteger objects
        BigInteger a
                = new BigInteger(input1);
        BigInteger b
                = new BigInteger(input2);

        // Calculate gcd
        result = a.gcd(b);

        // Print result
        System.out.println("The GCD of "
                + a + " and "
                + b + " is "
                + result);
    }
}