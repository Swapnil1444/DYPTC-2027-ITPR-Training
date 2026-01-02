package Lab1;

import java.util.Scanner;

public class BankAccount {

	int balance=5000;
	int deposit;
	int withdrawal;
	Scanner sc=new Scanner(System.in);
	
	public void withdrawalfun() {
		
     System.out.print("wich amount are withdrawal:");
     withdrawal=sc.nextInt();
     if(balance<=withdrawal) {
    	 
    	 throw new Bank("insufficient balence..");
     }
     else {
    	 System.out.println("suceefull withdrawal amount...!");
     }
		
	}
	
	public void depositfun() {
		System.out.println("how to deposite Aomunt:");
	     deposit=sc.nextInt();
	     
	     if(0>=deposit) {
	    	 throw new Bank("invalid ");
	     }
	     else {
	    	 balance+=deposit;
	    	 System.out.println("suceefull deposite amount...!"+balance);
	     }
	     
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankAccount b=new BankAccount();
   		
       
	   do {
    	   Scanner sc=new Scanner(System.in);
           System.out.println("Select Option:\n 1.withdrawal amount \n 2.deposite amount \n 3.exit");
           int key=sc.nextInt();
           
       switch (key) {
	    case 1: {
	    	b.withdrawalfun();
	    	break;
	     }
	    case 2: {
	    	 b.depositfun();
	    	 break;
	     }
	    case 3:{
	    	System.out.println("exit...");
	    	break;
	    	
	    }
	    default:
		throw new IllegalArgumentException("Unexpected value: " + key);
	     }
       }while(true);
      
       
       
	}

}
