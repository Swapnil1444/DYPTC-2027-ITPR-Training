import java.util.Scanner;

public class user_exption {
	
	int amount=6000;
	int withdraw;
	
	public void m1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdrow amount:");
		withdraw=sc.nextInt();
		
		if(amount<withdraw) {
			
			throw new Bank("insufficient balence..");
		}
		else {
			System.out.println("suceefull...");
		}
			
	}
	
	
	public static void main(String[] args) {
		

	}

}
