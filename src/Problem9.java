import java.util.Scanner;
public class Problem9 {
    public static Scanner sc = new Scanner(System.in);
    public static int binomiamCoeffficient(int n ,  int k) {
        if(k == 0 || k == n){
            return 1;
        }
        return binomiamCoeffficient(n-1, k-1) + binomiamCoeffficient(n-1, k);
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomiamCoeffficient(n, k));
    }
}
