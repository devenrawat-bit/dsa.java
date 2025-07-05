class array_implementation {
    int arr[] = new int[5];
    int index = 0;
    // push
    public void push(int a) { // correct
        if (isFull()) {
            System.out.println("can not insert stack is full!");
        } else {
            arr[index] = a;
            index++;
        }
    }
    // pop
    public int pop() { // complete
        if (isEmpty()) {
            System.out.println("can not pop element the stack is empty!");
            return -1;
        } else {
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;// important
            return top;
        }
    }
    // peek
    public int peek() // fully correct
    {
        if (isEmpty()) {
            System.out.println("no element present in the stack!");
            return -1;
        } else {
            return arr[index - 1];
        }
    }
    // isEmpty()
    public boolean isEmpty() { // correct
        if (index == 0) {
            // System.out.println("the stack is empty!");
            return true;
        } else {
            return false;
        }
    }
    // isFull
    public boolean isFull() { // correct
        if (index == arr.length) {
            return true;
        } else {
            return false;
        }
    }
    // capacity
    public int capacity() {// correct
        return arr.length;
    }
    // sizeOf
    public int sizeOf() { // correct
        return index;
    }
    // print
    public void display() // fully correct
    {
        for (int i = 0; i <= index - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class array_implementation_of_stack {
    public static void main(String[] args) {
        array_implementation st = new array_implementation();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(12);
        st.push(123);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.display();
        System.out.println("this is the size");
        System.out.println(st.sizeOf());
        System.out.println(st.capacity());
        System.out.println(st.isFull());
        st.push(1212);
        st.push(1212);
        st.push(1212);
        st.push(1212);
        st.display();
        st.push(1212);// this will throw error 
    }
}



 // push
    // pop
    // peek
    // isEmpty
    // isFull
    // capacity
    // sizeOf
    // display
    // there are 8 main methods in the stack implementation