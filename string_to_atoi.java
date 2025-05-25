import java.util.Scanner;

public class string_to_atoi {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        int sign = 1;
        int i = 0;
        int result = 0;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+')
            i++;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9')
                break;
            int digit = ch - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String a = sc.nextLine();
        int ans = myAtoi(a);
        System.out.println(ans);
        sc.close();
    }
}
