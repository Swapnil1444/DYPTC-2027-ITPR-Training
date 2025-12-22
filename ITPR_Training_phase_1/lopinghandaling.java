public class lopinghandaling {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if (i==4) {
                System.out.println("Skipping number using contiune:4");
                continue;
            } else {
                System.out.println(i);
            }
        }
        for(int i = 1; i <= 10; i++) {
            if (i==4) {
                System.out.println("Skipping number using break: 4");
                break;
            } else {
                System.out.println(i);
            }
        }
        //betwise operators 
        int a = 5, b = 3;
        System.out.println("Bitwise of " + a + " and " + b + " is: ");
        System.out.println("a & b= "+(a&b));// return 1
        System.out.println("a|b= "+(a|b)); // returen 7
        System.out.println("a^b= "+(a^b)); // return 6
        System.out.println("~a= "+(~a)); // return -6
    }
}
