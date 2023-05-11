
// package GettingStarted;
import java.util.*;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        System.out.println("Enter n values: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        System.out.println(max(list));
    }

    static int max(ArrayList<Integer> list) {
        int m = Integer.MIN_VALUE;
        for (int x : list) {
            if (x > m) {
                m = x;
            }
        }
        return m;

    }

}
