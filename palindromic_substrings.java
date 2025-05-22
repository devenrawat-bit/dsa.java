//this below is the solution of leetcodes question number 647
//note this code is not an optimized approach its a brute force and the optimized way is by dp and expand around centre
import java.util.*;

public class palindromic_substrings {
    public static boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j)) == true) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String a = sc.nextLine();
        int ans = countSubstrings(a);
        System.out.println("the total number of palindromic substrings are: " + ans);
        sc.close();
    }
}
