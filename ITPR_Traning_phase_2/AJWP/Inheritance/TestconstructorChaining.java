// Describe the concept of constructor chaining and how it works in Java inheritance.?

package AJWP.Inheritance;

class Employee {
    Employee(String name) {
        System.out.println("Employee constructor: " + name);
    }

    Employee() 
    { 
        this("Default Name"); 
        System.out.println("No-arg constructor"); 
    } 
}

class Manager extends Employee {
    Manager(String name) {
        super(); // Calls Employee's no-arg constructor
        System.out.println("Manager constructor: " + name);
    }
}

public class TestconstructorChaining {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice");
    }
}
