import java.util.Scanner;

public class add_binary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string: ");
        String a = sc.nextLine();
        System.out.println("enter the second string: ");
        String b = sc.nextLine();
        String ans = addBinary(a, b);
        System.out.println(ans);
        sc.close();

    }
}
