package lab3_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class cricketer1 {
	
	HashMap<String, Integer> batsman=new HashMap<String, Integer>();
	
	public cricketer1() {
	
		batsman.put("rohit",200);
		batsman.put("Virat",100);
		batsman.put("Hardik",50);
		batsman.put("Dhoni",40);
	}
	
	void sharch_batsman_score(String name) {
		
		if(batsman.containsKey(name)) {
			System.out.println("batsman "+name+" display his score : "+batsman.get(name));
		}else {
			System.out.print("Batsman not found...!");
		}
		
	}

	public static void main(String[] args) {
		cricketer1 c=new cricketer1();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("search for the batsman name and display his score:");
		String name=sc.nextLine();
		c.sharch_batsman_score(name);
		
		sc.close();
	}

}
