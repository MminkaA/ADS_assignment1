import java.util.Scanner;
public class Problem6 {
    public static double power(double a, int n) { //complexity O(n)
        return (n == 0) ? 1 : (n > 0) ? a * power(a, n - 1) : 1 / (a * power(a, -n - 1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("base: ");
        double a = scanner.nextDouble();
        System.out.print("exponent: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("result: " + power(a, n));
    }
}
