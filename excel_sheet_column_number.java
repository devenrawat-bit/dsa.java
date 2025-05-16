import java.util.Scanner;

public class excel_sheet_column_number {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string in caps: ");
        String a = sc.nextLine();
        int ans = titleToNumber(a);
        System.out.println("the answer is: " + ans);
        sc.close();
    }
}