import java.util.Scanner;

public class check_palindrome {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;

            // Move right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            // Compare characters at left and right pointer (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("enter the string: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean ans = isPalindrome(a);
        System.out.println(ans);
        sc.close();
    }
}