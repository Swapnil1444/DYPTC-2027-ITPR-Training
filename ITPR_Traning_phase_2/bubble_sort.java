
public class bubble_sort {

	public void bubble(int[] arr) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
					
			     }
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {10,9,6,5,20,15};
		bubble_sort b=new bubble_sort();
		b.bubble(arr);
		for(int num:arr) {
			System.out.println(num);
		}
		
	}

}
