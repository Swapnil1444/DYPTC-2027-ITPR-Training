//Discuss the concept of an abstract class in Java and how it is related to inheritance. Provide an example.?
package AJWP.inheritans;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method (no body)
    abstract double calculateBonus();

    // Concrete method
    void showDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // Managers get 20% bonus
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // Developers get 15% bonus
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 80000);
        Employee e2 = new Developer("Bob", 60000);

        e1.showDetails();
        System.out.println("Bonus: " + e1.calculateBonus());

        e2.showDetails();
        System.out.println("Bonus: " + e2.calculateBonus());
    }
}
