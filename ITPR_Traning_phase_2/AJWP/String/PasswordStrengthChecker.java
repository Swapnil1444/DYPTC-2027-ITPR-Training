
// You are developing a password strength checker for a security application. Write a Java method to evaluate the strength of a given password based on the following criteria:
// At least 8 characters long
// Contains at least one uppercase letter, one lowercase letter, one digit, and one special character

// Sample Input: "P@ssw0rd"
// Sample Output: Strong password
package AJWP.String;
public class PasswordStrengthChecker {
    public static void main(String[] args) {
        String password = "P@ssw0rd";
        if (isStrongPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }

    static boolean isStrongPassword(String password) {
        // Regex enforces all rules in one line
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
    }
}
