import java.util.Scanner;
public class Problem7 {
    public static void permutations(String str, String prefix) { //complexity O(n!)
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations(str.substring(0, i) + str.substring(i+1, n), prefix + str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        permutations(input, "");
    }
}
