
import java.util.*; 

public class person {
    String name;
    int age;
    person(String name,int age){
       this.age=age;
       
       this.name=name;
    }

    public static void main(String[] args) {
        person p=new person("swapnil", 20);
        person p1=new person("om", 02);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        sc.nextLine(); // removing space as input in this line to add the sc.nextLine();
        System.out.println("Enter name:");
        String name=sc.nextLine();
        
        System.out.println("Enter salary:");
        double salary=sc.nextDouble();
        System.out.println("\n name:"+name+" \n age:"+age+" \n salary"+salary);
        

        System.out.println("name:"+p.name);
        System.out.println("age:"+p.age);
        
        System.out.println("name:"+p1.name);
        System.out.println("age:"+p1.age);
       // Integer a=null;
    }
}
