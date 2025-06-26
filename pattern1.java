public class pattern1 {
    public static void main(String[] args){
        int n=5,m=6;
        System.out.println("Pattern 1:");
        for(int i=1;i<=n; i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || i==n || j==1 || j==m)
                {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
        
        System.out.println("Pattern 2:");

        for(int a=1; a<=n; a++){
            for(int b=1;b<=a;b++)
            {
                 System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println("Pattern 3:");
        for(int c=1; c<=n; c++){
            for(int d=1;d<=n-c;d++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Pattern 4:");
        for(int e=1; e<=n; e++){
            for(int f=1;f<=e;f++){
                System.out.print("");
            }
            for(int g=1; g<=m-e; g++){
                System.out.print("@");
            }
            System.out.println("");
        }

        System.out.println("Pattern 5:");
        int num=1;
        for(int h=1; h<=n; h++){
            for(int k=1; k<=h;k++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }  
        System.out.println("Pattern 6:");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
