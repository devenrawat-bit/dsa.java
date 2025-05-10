import java.util.Scanner;
//note the elements enter in the array must be smaller than size of the array 
public class build_array_from_permutation_1920 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] arraysOfPermutation(int arr[]) {
        int ans[] = new int[arr.length];
        
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[arr[i]];

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the %d element:", i + 1);
            arr[i] = sc.nextInt();
        }
        int f_ans[] = arraysOfPermutation(arr);
        System.out.println("now the array is: ");
        print(f_ans);
        sc.close();

    }
}