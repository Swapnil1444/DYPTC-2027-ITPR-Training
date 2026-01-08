package lab4;

import java.util.HashSet;

public class heshset {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(5);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(25);
		
		System.out.println(hs);

		if(hs.contains(10)) {
			System.out.println("HashSet contains 10");
		}
		
		hs.remove(15);
		System.out.println(hs);
		
		System.out.println(hs.size());
		
	}

}
