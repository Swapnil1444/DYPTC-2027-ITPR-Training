public class staticabstractmethod {
    public static void main(String[] args) {
        Animal.info();
        Dog d=new Dog();
        d.sound(); // default method
    }
}
interface Animal {
    void walk(); // abstract method
    void eat();  // abstract method    
    static void info() {
        System.out.println("This is an Animal interface");
    }
    default void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog implements Animal {
    public void walk() {
        System.out.println("Dog is walking");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }

}

