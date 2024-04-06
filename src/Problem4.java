import java.util.Scanner;
public class Problem4 {
    public static int factorial(int n) {//complexity O(n!)
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number of factorial: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("factorial of " + n + " is: " + factorial(n));
    }
}
