//the below code is the solution of the leetcodes question number 20
import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();
                if ((top == '(' && ch != ')') ||
                    (top == '{' && ch != '}') ||
                    (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses string: ");
        String input = sc.nextLine();

        if (isValid(input)) {
            System.out.println("✅ Valid Parentheses");
        } else {
            System.out.println("❌ Invalid Parentheses");
        }

        sc.close();
    }
}
