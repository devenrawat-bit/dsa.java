//this below code is the solution of the leetcodes question number 557
import java.util.*;

public class reverse_words_in_string {

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                ans.append(word.reverse());
                ans.append(' ');
                word.setLength(0); // clear word sb
                // use setlength instead of delete as this is faster than delete as it will
                // iterate and then delete
            }
        }
        // reverse and append the last word
        ans.append(word.reverse());
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String a = sc.nextLine();
        String ans = reverseWords(a);
        System.out.println(ans);
        sc.close();
    }
}
