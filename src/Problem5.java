import java.util.Scanner;
public class Problem5 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the value to find the nth fibonacci number: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("the " + n + "th fibonacci number is: " + fibonacci(n));
    }
}
