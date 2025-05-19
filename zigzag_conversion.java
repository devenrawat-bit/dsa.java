import java.util.Scanner;

public class zigzag_conversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder result = new StringBuilder();
        int cycleLen = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int i = row; i < s.length(); i += cycleLen) {
                result.append(s.charAt(i));

                int secondChar = i + cycleLen - 2 * row;
                if (row != 0 && row != numRows - 1 && secondChar < s.length()) {
                    result.append(s.charAt(secondChar));
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String a1 = sc.nextLine();
        System.out.println("enter the rows: ");
        int a = sc.nextInt();
        String ans = convert(a1, a);
        System.out.println("the string after zigzag conversion is : " + ans);
        sc.close();

    }
}