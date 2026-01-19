// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, 
// Developer, and Programmer. Each subclass should have properties such as name, address,
//  salary, and job title. Implement methods for calculating bonuses, generating performance reports, 
//  and managing projects.
package AJWP.inheritans;

class Employee {
    String name, address, jobTitle;
    double salary;

    double calculateBonus() {
        return salary * 0.10;
    }

    void generatePerformanceReport() {
        System.out.println(jobTitle + " " + name + " performance report.");
    }
}

class Manager extends Employee {
    void manageProjects() {
        System.out.println(name + " is managing projects.");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    @Override
    void generatePerformanceReport() {
        System.out.println("Developer " + name + " completed coding tasks.");
    }
}

class Programmer extends Employee {
    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}

public class q1 {

    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.name = "Alice";
        mgr.address = "123 Main St";
        mgr.salary = 80000;
        mgr.jobTitle = "Project Manager";

        Developer dev = new Developer();
        dev.name = "Bob";
        dev.address = "456 Elm St";
        dev.salary = 70000;
        dev.jobTitle = "Software Developer";

        Programmer prg = new Programmer();
        prg.name = "Charlie";
        prg.address = "789 Oak St";
        prg.salary = 60000;
        prg.jobTitle = "Programmer";

        System.out.println(mgr.name + "'s Bonus: $" + mgr.calculateBonus());
        mgr.generatePerformanceReport();
        mgr.manageProjects();

        System.out.println(dev.name + "'s Bonus: $" + dev.calculateBonus());
        dev.generatePerformanceReport();

        System.out.println(prg.name + "'s Bonus: $" + prg.calculateBonus());
        prg.generatePerformanceReport();
    }
}