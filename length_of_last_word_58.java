import java.util.Scanner;

public class length_of_last_word_58 {
    public static int length(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String yo = sc.nextLine();
        int ans = length(yo);
        System.out.println("the last word length is: " + ans);
        sc.close();
    }
}
