import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6};

        // Sorting the array
        Arrays.sort(arr);

        // Printing sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
