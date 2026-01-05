package lab3_hashmap;

import java.util.HashMap;

public class map_collection_fromwork {

	public map_collection_fromwork() {
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		hm.put(1,"Swapnil");
		hm.put(2,"Prachi");
		hm.put(3,"om");
		
		
		System.out.println(hm);
		
		System.out.println("Accept key 2: "+hm.get(2));
		
		if(hm.containsKey(3)) {
			System.out.println("containsKey");
		}
		else {
			System.out.println("not containsKey");
		}
		
	}
	
	public static void main(String[] args) {
		
		map_collection_fromwork m=new map_collection_fromwork();

	}

}
