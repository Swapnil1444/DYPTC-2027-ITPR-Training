interface Animal {
    void walk(); // abstract method
    void eat();  // abstract method    
}
interface cat {
    void meow(); // abstract method
    void sleep(); // abstract method
}
class dog implements Animal, cat {
    public void walk() {
        System.out.println("Dog is walking");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void meow() {
        System.out.println("Dog cannot meow");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
} 
public class Intarface {
    public static void main(String[] args) {
        dog d = new dog();
        d.walk(); // method implementation
        d.eat();  // method implementation
        d.meow();
        d.sleep();
    }
}
