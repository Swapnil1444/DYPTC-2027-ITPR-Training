import java.util.HashMap;

public class Student_map {
	int id;
	String name;

	public Student_map(int id,String name) {
      this.id=id;
      this.name=name;
	}
	public String toString() {
		return "\n id: "+id+" name: "+name+" \n";
		
	}
	

	public static void main(String[] args) {
	
		Student_map s1=new Student_map(10,"swapnil");
		HashMap<Integer,Student_map> hm=new HashMap<Integer,Student_map>();
		hm.put(1,s1);
		
		System.out.println(hm);

	}

}
