
class demo{

    void add(){
        int a=10;
        int b=20;
        System.out.println("The sum is: "+(a+b));
    }

    // //polymorphism: method overriding
    // void print1(int a){
    //     System.out.println("This print"+a);
    // }
    // void print1(int a,int b){
    //     System.out.println("This print"+a+" "+b);
    // }
    // void print1(int a, float b){
    //     System.out.println("This print"+a+" "+b);
    // }
    // void print1(float a, int b){
    //     System.out.println("This print"+a+" "+b);
    // }
    // void print1(float a, float b){
    //     System.out.println("This print"+a+" "+b);
    // }
    // void print1(int a, int b, int c){
    //     System.out.println("This print"+a+" "+b+" "+c);
    // }
    // void print1(double a, double b){
    //     System.out.println("This print"+a+" "+b);}

}

    class demo1 extends demo  {
        void mul()
        {
            int a=10;
            int b=20;
            System.out.println("The multiplication is: "+(a*b));
        }

    }
    class demo2 extends demo1{
        void sub()
        {
            int a=10;
            int b=20;
            System.out.println("The subtraction is: "+(a-b));
        }
    }

public class Polymorphism {
    public static void main(String[] args) {
        demo2 d=new demo2();

        // d.print1(3.3,5.4);
        // d.print1(2);
        // d.print1(4f, 04f);
        // d.print1(3, 4);
        
        d.sub();
        d.mul();
        d.add();

    }
}
