//harachical inheritance
class Plane {
    void fly() {
        System.out.println("The plane is flying");
    }
}
class cargoplane extends Plane{
    void fly() {
        super.fly(); // Calls the fly method of the parent class
        System.out.println("The cargo plane is flying with cargo");
    }
}
class passengerplane extends Plane{
    void fly() {
        System.out.println("The passenger plane is flying with passengers");
    }
}
class fighterplane extends Plane{
    void fly() {
        System.out.println("The fighter plane is flying with weapons");
    }
    void carryWeapons() {
        System.out.println("The fighter plane is carrying weapons");
    }
}
class Airport{
    static void permit(Plane ref) {
        ref.fly(); // This will call the fly method of the respective plane type based on the reference type
    }
}
class PlaneDemo{
    public static void main(String[]args){
        // // type capling 
        cargoplane cp= new cargoplane();
        passengerplane pp= new passengerplane();
        fighterplane fp= new fighterplane();
         
        // // cp.fly();
        // // pp.fly();
        // // fp.fly();
        
        // loose capling 
        Plane ref; // reference of parent class
        ref=cp;
        ref.fly();
        ref=pp;
        ref.fly();
        ref=fp;
        ref.fly();
        ((fighterplane)(ref)).carryWeapons();


        Airport.permit(cp); // This will call the fly method of cargoplane
        Airport.permit(pp); // This will call the fly method of passengerplane
        Airport.permit(fp); // This will call the fly method of fighterplane
        


        // Plane p= new cargoplane();
        // Plane p1=new passengerplane();
        // Plane p2=new fighterplane();
        // p.fly(); // This will call the fly method of the respective plane type based on the
        // p1.fly();  
        // p2.fly();
       

        }
}