package introductoryProblems;
import java.util.Scanner;
public class bit_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long result = 1;
        long mod = 1000000007; // 10^9 + 7

        for (int i = 0; i < n; i++) {
            result = (result * 2) % mod;
        }

        System.out.println(result);
    }
}
