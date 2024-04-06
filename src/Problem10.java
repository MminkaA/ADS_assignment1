import java.util.Scanner;
public class Problem10 {
    public static int gcd(int a, int b) {//complexity: O(log(min(a,b)))
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt();
        scanner.close();
        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
    }
}
