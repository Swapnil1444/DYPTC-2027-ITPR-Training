
public class interface_demo {

	public static void main(String[] args) {
		
		abc_interface obj= (int a)-> {
			
			System.out.println(a);
		};
		
		One obj1=()->{
			
			System.out.println("hello");
		};
		
		obj1.m1();
		obj.m2(19);
		
		
		
	}
	 
}
