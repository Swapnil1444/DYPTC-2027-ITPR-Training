package Lab2;

import java.util.ArrayList;

public class ArrayList_sum_of_even {

	public static void main(String[] args) {
		

		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(15);
		numbers.add(20); 
		numbers.add(25);
		
		int sum=0;
		for(int num:numbers) {
			if(num%2==0) {
				sum+=num;
			}
		}
		System.out.println(sum);
	}

}
