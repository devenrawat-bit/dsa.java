import java.lang.String;
import java.util.Scanner;

public class convert_roman_to_integer {
    public static int getvalue(char a) {
        switch (a) {

            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            // IV
            char ch = s.charAt(i);
            if ((i + 1) < len && getvalue(ch) < getvalue(s.charAt(i + 1))) {
                sum = sum - getvalue(ch);
            } else {
                sum = sum + getvalue(ch);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter the roman number " + "all should be in capital letters only: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int ans = romanToInt(a);
        System.out.println(ans);
        sc.close();
    }
}
