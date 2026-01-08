import java.util.Scanner;
import java.util.TreeSet;

public class treeset {
  public static void main(String[]args) {
	  TreeSet<Integer> ts=new TreeSet<Integer>();
	  ts.add(55);
	  ts.add(22);
	  ts.add(77);
	  ts.add(11);
	  
	  System.out.println(ts);
	  
	  ts.remove(77);
	  System.out.println("remove 77 : "+ts);
	  
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("which value are search:");
	  int s=scanner.nextInt();
	  
	  if(ts.contains(s)) {
		  System.out.print("Element is found..."+s);
	  }
	  else {
		  System.out.println("Element not found...");
	  }
	  
	  
  }
}
