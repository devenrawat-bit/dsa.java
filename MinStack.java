import java.util.Stack;

public class MinStack {
    private long min = -1;
    private Stack<Long> st = new Stack<>();

    // Constructor
    public MinStack() {
    }

    // Push element onto the stack
    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = val;
        } else if (val >= min) {
            st.push((long) val);
        } else {
            st.push(2L * val - min);  // Store fake value
            min = val;
        }
    }

    // Pop element from the stack
    public void pop() {
        if (st.isEmpty()) return;

        if (st.peek() >= min) {
            st.pop();
        } else {
            long oldMin = 2 * min - st.peek();
            min = oldMin;
            st.pop();
        }
    }

    // Get top element
    public int top() {
        if (st.isEmpty()) return -1;

        if (st.peek() >= min) {
            return (int) (long) st.peek();
        } else {
            return (int) min;
        }
    }

    // Get minimum element
    public int getMin() {
        if (st.isEmpty()) return -1;
        return (int) min;
    }

    // For testing
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println("Top: " + stack.top());      // 7
        System.out.println("Min: " + stack.getMin());   // 3
        stack.pop();
        System.out.println("Top: " + stack.top());      // 3
        System.out.println("Min: " + stack.getMin());   // 3
        stack.pop();
        System.out.println("Min: " + stack.getMin());   // 5
    }
}
