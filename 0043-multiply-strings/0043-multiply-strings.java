import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        // Convert strings to BigInteger objects
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        
        // Multiply them using the built-in multiply method
        BigInteger result = number1.multiply(number2);
        
        // Convert the result back to a String and return it
        return result.toString();
    }
}
