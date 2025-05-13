//this is the leetcode 9th number problem solution 
import java.util.Scanner;

public class check_palindrome_number {
    public static boolean isPalindrome(int x) {
        // edge case negative number are not palindrome
        if (x < 0) {
            return false;
        } else {
            int rev = 0;
            int n = x;
            while (n > 0) {
                // 121
                rev = (rev * 10) + n % 10;
                n = n / 10;
            }
            return rev == x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = sc.nextInt();
        boolean ans = isPalindrome(a);
        System.out.println(ans);
        sc.close();
    }
}
