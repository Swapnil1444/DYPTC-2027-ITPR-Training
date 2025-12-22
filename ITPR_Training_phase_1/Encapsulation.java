class student{
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        student s=new student();
        s.setName("Swapnil");
        System.out.println(s.getName());
    }
}
