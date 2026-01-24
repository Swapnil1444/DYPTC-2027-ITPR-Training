// You are developing a contact management application. Write a Java method to format a phone number by adding dashes (-) in the appropriate positions.

// Sample Input: "1234567890"
// Sample Output: "123-456-7890"
package AJWP.String;
public class PhoneFormatter {
    public static void main(String[] args) {
        String phone = "1234567890";
        System.out.println("Formatted Phone: " + formatPhoneNumber(phone));
    }

    static String formatPhoneNumber(String number) {
        if (number.length() != 10) {
            return "Invalid phone number";
        }
        return number.substring(0, 3) + "-" +
               number.substring(3, 6) + "-" +
               number.substring(6);
    }
}
