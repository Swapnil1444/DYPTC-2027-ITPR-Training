//print peremint with '*'
public class q1 {
    public static void main(String[]args)
    {
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int a=5;
        for(int k=0; k<a; k++)
        {
            for(int e=0; e<a; e++)
            {
                if (e >a - k - 1) {
                    System.out.print("*");
                } 
            }
            System.out.println();
        }

    }
  
}
