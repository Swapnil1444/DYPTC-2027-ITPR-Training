import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;
        System.out.println("Factorial is: \n");
        for(int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(fact);
        }
        
    }
}
