abstract class Animal{
    

     abstract void walk();
     void eat(){
         System.out.println("Animal is eating");
     }
     //{System.out.println("Animal is created");}
 
}
class Dog extends Animal{
    void walk(){
        System.out.println("Dog is walking");
    }
}
public class Abtraction {
   public static void main(String[] args) {
    Dog d=new Dog();
    d.walk(); //abstract method implementation
    d.eat();// not abstract method implementation
   } 
}
