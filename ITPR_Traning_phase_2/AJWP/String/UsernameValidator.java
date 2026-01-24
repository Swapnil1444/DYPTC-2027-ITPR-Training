// You are developing a user registration system for a website. Write a Java method to validate if a given username is valid or not. A valid username should contain only alphanumeric characters and underscores, should start with a letter, and be between 5 to 20 characters long.

// Sample Input: "user_123"
// Sample Output: Valid username

package AJWP.String;
public class UsernameValidator {
    public static void main(String[] args) {
        String username = "user_123";
        if (isValidUsername(username)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

    static boolean isValidUsername(String username) {
        // Regex: starts with letter, followed by letters/digits/underscores, length 5–20
        return username.matches("^[A-Za-z][A-Za-z0-9_]{4,19}$");
    }
}
