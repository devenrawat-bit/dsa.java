import java.util.Scanner;

public class longest_common_prefix {
    public static String lcp(String[] arr) {
        String prefix = arr[0];
        // flower;
        //flower flow float
        //flo
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the string array: ");
        int a = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the %d string: ", i + 1);
            arr[i] = sc.nextLine();
        }
        String ans = lcp(arr);
        System.out.println("the longest common prefix is: " + ans);
        sc.close();
    }
}
