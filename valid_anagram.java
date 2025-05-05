import java.util.Scanner;
import java.util.Arrays;
public class valid_anagram {
    public static boolean isAnagram(String s, String t) {
        boolean ans = false;
        if (s.length() != t.length())
            return false;
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        // now converting back the char array into the string
        String sortedA = new String(char1);
        String sortedB = new String(char2);
        int ans1 = sortedA.compareTo(sortedB);
        if (ans1 == 0) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("enter the first string: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("enter the second string: ");
        String b = sc.nextLine();
        boolean ans = isAnagram(a, b);
        if (ans) {
            System.out.println("its valid anagaram ");

        } else {
            System.out.println("its not valid anagram");
        }
        sc.close();
    }
}