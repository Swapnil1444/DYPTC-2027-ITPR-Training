class plane{
    void fly() {
        System.out.println("The plane is flying");
    }
}
class cargoplane extends plane{
    void fly() {
        System.out.println("The cargo plane is flying with cargo");
        super.fly(); // Calls the fly method of the parent class
    }
}

public class superkeyword {
    public static void main(String[] args) {
        cargoplane cp=new cargoplane();
        cp.fly(); // This will call the fly method of cargoplane
    }
}
