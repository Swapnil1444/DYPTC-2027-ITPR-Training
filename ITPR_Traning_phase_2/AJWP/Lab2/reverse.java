package Lab2;

import java.util.ArrayList;

public class reverse {

	public static void main(String[] args) {
		
		ArrayList<String> value=new ArrayList<String>();
		
		value.add("swapnil");
		value.add("shital");
		value.add("om");
		
		System.out.println(value);
		System.out.println("uning keyword: "+value.reversed());
		
		
        int start = 0;
        int end = value.size() - 1;

        while (start < end) {
            String temp = value.get(start);
            value.set(start, value.get(end));
            value.set(end, temp);
            start++;
            end--;
        }

        System.out.println("Reversed List: " + value);
		
	}

}
