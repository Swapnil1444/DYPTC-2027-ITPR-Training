import java.util.Scanner;
public class methad{

    // int add1()
    // {
    //     int a=30;
    //     int b=40;
    //     int sum=a+b;
    //     return sum;
    // }

    public static int add(int a,int b){
        int c=a+b;
        return c;
       // System.out.println("The sum of " + a + " and " + b + " is: " + c+"\n");
    }

    int prodect(int a,int b){
        int c=a*b;
        return c;
    }

    public methad(){
        System.out.println("**This is a constructor of methed class**\n");
    }

    public static void main(String[]args)
    {
         methad obj = new methad();
        
        // System.out.println("result is :"+ obj.add1());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter frist number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
         System.out.println("The sum is: " +add(a,b)+"\n");

         System.out.println("Enter the prodect value of two numbers:");
         int c=sc.nextInt();
         int d=sc.nextInt();
         System.out.println("the prodect is "+obj.prodect(c,d));
    }
}