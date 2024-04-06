import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] array = {10, 1, 32, 3, 45};
        int minimum = findMinimum(array);
        System.out.println("min element: " + minimum);
    }
    public static int findMinimum(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}