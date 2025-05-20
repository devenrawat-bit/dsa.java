import java.util.Scanner;

public class multiply_string {
    public static String multiply(String num1, String num2) {
        if (num1.length() == 1 && num1.charAt(0) == '0') {
            return "0";
        }
        int arr[] = new int[num1.length() + num2.length()];
        // instead of reversing this we can start loop from backward
        // will save computations
        // 123
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + arr[i + j + 1];
                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (ans.length() == 0 && arr[i] == 0) {
                continue;
            }
            ans.append(arr[i]);
        }
        if (ans.length() == 0) {
            return "0";
        } else {
            return ans.toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first string: ");
        String a = sc.nextLine();
        System.out.println("enter the second string: ");
        String b = sc.nextLine();
        String ans = multiply(a, b);
        System.out.println("the answer is: " + ans);
        sc.close();
    }
}
