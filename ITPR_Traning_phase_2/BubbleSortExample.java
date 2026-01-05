import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted Array: " + Arrays.toString(arr));
        
        
        int[] arr2 = {5, 2, 9, 1, 5, 6};
        Arrays.sort(arr2);
        System.out.println("Arrays.sort() Result: " + Arrays.toString(arr2));
    }
}
