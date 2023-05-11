
// package GettingStarted;
import java.util.*;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number element: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " values: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Sum: " + sum(1, 2, 3, 4));
        // System.out.println("Sum: " + sum(a));-->we can pass input as array or
        // arraylist.
    }

    static int sum(int... list) {
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        return sum;
    }

}
