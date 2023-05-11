import java.util.*;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(Check(n));
    }

    static String Check(int n) {
        if (n % 2 == 0)
            return "even";
        else
            return "odd";
    }
}