import java.util.Scanner;
import java.util.Stack;
public class remove_consecutive_subsequence {
    public static int [] remove(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if (st.isEmpty() || st.peek()!=arr[i]) {
                st.push(arr[i]);
            }
            else if (arr[i]==st.peek()) {//do nothing
                if (i==n-1 ||arr[i]!=arr[i+1]) {
                    st.pop();
                }
            }
        }
        int ar[]=new int[st.size()];
        for(int i=ar.length-1;i>=0;i--)
        {
            ar[i]=st.pop();
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int len=sc.nextInt();
        int arrr[]=new int[len];
        for(int i=0;i<arrr.length;i++)
        {
            System.out.printf("enter the %d element: ",i+1);
            arrr[i]=sc.nextInt();
        }
        int ans[]=remove(arrr);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
