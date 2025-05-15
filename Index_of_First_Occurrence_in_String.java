import java.util.Scanner;

public class Index_of_First_Occurrence_in_String {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the haystack string: ");
        String haystack = sc.nextLine();
        System.out.println("enter the needle string : ");
        String needle = sc.nextLine();
        int ind = strStr(haystack, needle);
        System.out.println("the index of the first occurence of the needle in the haystack is: " + ind);
        sc.close();

    }
}
