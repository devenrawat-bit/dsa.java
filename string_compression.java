import java.util.Scanner;

public class string_compression {
    public static int compress(char[] chars) {
        int count = 1;
        StringBuilder ans = new StringBuilder();
        ans.append(chars[0]); // start with first char
        for (int i = 1; i < chars.length; i++) {
            char curr = chars[i];
            char prev = chars[i - 1];
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans.append(count);
                }
                ans.append(curr);
                count = 1;
            }
        }
        if (count > 1) {
            ans.append(count);
        }
        // write ans back to chars[] in-place
        for (int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }
        return ans.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char (no spaces): ");
        String a1 = sc.nextLine();
        char []chars = a1.toCharArray();
        int ans = compress(chars);
        System.out.println("the total digit now after compression is: " + ans);
        sc.close();
    }
}