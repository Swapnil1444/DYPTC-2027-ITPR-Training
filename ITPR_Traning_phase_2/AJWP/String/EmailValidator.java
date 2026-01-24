// You are working on an email validation feature for a registration form. Write a Java method to validate if a given string is a valid email address according to basic email format rules (e.g., contains "@" symbol and domain).

// Sample Input: "example@email.com"
// Sample Output: Valid email address
 package AJWP.String;
public class EmailValidator {
    public static void main(String[] args) {
        String email = "example@email.com";
        if (isValidEmail(email)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }

    static boolean isValidEmail(String email) {
        // Basic regex for email validation
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
