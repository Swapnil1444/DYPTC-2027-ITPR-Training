abstract class cot{
    abstract void meow(); // abstract method
    abstract void sleep(); // abstract method
    cot(){
        System.out.println("Cat constructor called");
    }
}
class Demo extends cot {
    void meow() {
        System.out.println("Cat is meowing");
    }
    void sleep() {
        System.out.println("Cat is sleeping");
    }
    Demo() {
        super();
        System.out.println("Demo constructor called");
    
    }

    
}
public class cons1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.meow(); // method implementation
        d.sleep(); // method implementation
    }
}
