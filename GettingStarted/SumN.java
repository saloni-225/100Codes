
// package GettingStarted;
import java.util.*;

public class SumN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Sum of n natural number: "+sum(n));
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
}
