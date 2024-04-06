import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) { // complexity O(n)
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        System.out.println((double) sum / n);
        s.close();
    }
}
