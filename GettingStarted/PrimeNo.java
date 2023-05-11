
// package GettingStarted;
import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter your range: ");
        a = sc.nextInt();
        b = sc.nextInt();
        checkPrime(a, b);
    }

    static void checkPrime(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 1 || n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
