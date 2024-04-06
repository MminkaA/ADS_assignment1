import java.util.Scanner;
public class Problem8 {
    public static boolean isAllDigits(String s) {
        return s.matches("\\d+");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(isAllDigits(input) ? "yes" : "no");
    }
}
