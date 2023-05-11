//Palindrome Number.
import java.util.*;
class PalindromeNo{
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        n=sc.nextInt();
        int temp=checkPalindrome(n,0);
        if(temp==n)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static int checkPalindrome(int n,int temp)
    {
        if(n==0) return temp;
        temp=(temp*10)+(n%10);
        return checkPalindrome(n/10,temp);

    }

}