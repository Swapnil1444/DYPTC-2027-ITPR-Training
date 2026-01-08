import java.util.Scanner;

public class exption_handaling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Frist Number:");
			int n1=sc.nextInt();
			
			System.out.println("Enter the Second Number:");
			int n2=sc.nextInt();
			
			int r=n1/n2;
			System.out.println("ans:"+r);
			
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: Division by zero is not allowed");
			
		}finally {
			System.out.println("run...");
		}
      sc.close();
	}

}
