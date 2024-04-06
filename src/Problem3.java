import java.util.Scanner;
public class Problem3 {
    public static boolean isPrime(int n) { // complexity O(sqrt(n))
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("it's prime or not: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(isPrime(num) ? num + " is prime." : num + " is composite.");
    }
}
