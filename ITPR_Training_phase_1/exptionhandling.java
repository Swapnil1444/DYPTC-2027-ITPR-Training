import java.util.Scanner;

public class exptionhandling {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.Add();
    }
}
 class ArithmeticException1 extends Exception {
    public ArithmeticException1() {
        super("Numbers should be less than 10");
        
    }

    
}
class Demo{
    public void Add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try{
            if(a>=10||b>=10)
            {
                throw new ArithmeticException1();
            }
            System.out.println("Sum: " + (a + b));
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }catch(Exception e){
            System.out.println("program tarminated "); 
        }
        finally {
            System.out.println("Finally block executed");
            sc.close();
        } 
    }
}