package lab3;

import java.util.ArrayList;

public class Linear_Search {

	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5,6,8,9};
		int target=6;
		
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				
				index=i;
				//System.out.print("Element found...");
			}
		}
		if (index != -1)
		{ 
			System.out.println("Element " + target + " found at index " + index); 
		} else 
		{
			System.out.println("Element " + target + " not found in the array."); 
		}

	}

}
