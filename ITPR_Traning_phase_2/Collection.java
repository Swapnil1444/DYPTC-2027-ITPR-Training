import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> at=new ArrayList<String>(); 
		at.add("shital");
		at.add("suhani");
		at.add("prachi");//insertion order in preserve
		at.add(null);// null order is preserve
		//at.add(1); not add to int value to <string> remove this to add values
		System.out.println(at);
		at.remove(1); // remove 1 position value 
		System.out.println(at);
		
		System.out.println("Size of ArrayList: "+at.size());
		
		at.set(1,"om");// add value in 1 position 
		System.out.println(at);
		
		System.out.println(at.get(0));
		
		System.out.println(2%11);// output 2
		System.out.println(5%11);
		
		
		
		
	}

}
