import java.util.Scanner;

public class Arrayprogram {
    public static void main(String[] args) {
        System.out.println("one dimensional array");
        int[] arr1={1, 2, 3, 4, 5};

        for(int a:arr1){
            System.out.println(a);
        }

        System.out.println("two dimensional array");
        int[][] arr2 =new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for a 3x3 matrix:");

        for(int i=0; i<arr2.length;i++){
            for(int j=0; j<arr2[i].length;j++){
                System.out.print("Element at [" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        // arr2[0][0] = 1;
        // arr2[0][1] = 2;
        // arr2[0][2] = 3;
        // arr2[1][0] = 4;
        // arr2[1][1] = 5;
        // arr2[1][2] = 6;
        // arr2[2][0] = 7;
        // arr2[2][1] = 8;
        // arr2[2][2] = 9;

        for(int i=0; i<arr2.length;i++){
            for(int j=0; j<arr2[i].length;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
