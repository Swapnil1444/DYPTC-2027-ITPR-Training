//What's the role of the Object class in Java, and how is it related to inheritance?
package AJWP.inheritans;
class Employee1 {
    String name;
    Employee1(String name) {
        this.name = name;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Alice");
        Employee1 e2 = new Employee1("Alice");

        // Methods inherited from Object
        System.out.println(e1.toString());       // Default string representation
        System.out.println(e1.equals(e2));       // Compares references (unless overridden)
        System.out.println(e1.hashCode());       // Unique hash value
        System.out.println(e1.getClass());       // Prints class info: class Employee1
    }
}
