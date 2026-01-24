// Question: You are developing a calculator application. Write a Java method to check if a given string represents a valid numeric value (integer or floating-point).

// Sample Input: "123.45"
// Sample Output: Valid numeric value
package AJWP.String;
public class NumericValidator {
    public static void main(String[] args) {
        // Sample inputs
        String input1 = "123.45";
        String input2 = "abc";
        String input3 = "789";

        // Test the method
        System.out.println(input1 + " → " + (isValidNumber(input1) ? "Valid numeric value" : "Invalid numeric value"));
        System.out.println(input2 + " → " + (isValidNumber(input2) ? "Valid numeric value" : "Invalid numeric value"));
        System.out.println(input3 + " → " + (isValidNumber(input3) ? "Valid numeric value" : "Invalid numeric value"));
    }

    // Method to check if a string is a valid number
    static boolean isValidNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str); // works for both integers and floating-point
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
