import java.util.Scanner;
import java.util.Stack;
public class insert_at_any_index {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index where you want to add the number: ");
        int ind = sc.nextInt();
        System.out.println("enter the element you want to add in that index: ");
        int ele = sc.nextInt();
        System.out.println("enter the size of the stack: ");
        int a = sc.nextInt();
        while (a > 0) {
            System.out.println("enter element: ");
            int a1 = sc.nextInt();
            st.push(a1);
            a--;
        }
        System.out.println(st);
        // suppose we have to add a new element at index number 2 and the size of the
        // stack is 5
        Stack<Integer> stt = new Stack<>();
        while (st.size() > ind) {
            stt.push(st.pop());
        }
        stt.push(ele);
        while (stt.size() > 0) {
            st.push(stt.pop());
        }
        System.out.println(st);
        sc.close();
    }
}
