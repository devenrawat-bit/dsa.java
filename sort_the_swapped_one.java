import java.util.Scanner;
public class sort_the_swapped_one {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swapped(int arr[]) {
        if(arr.length==1)
            return;
        int x = -1, y = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1; 
                    y = i;
                } else y = i;
            }
        } // swap at end
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int a1 = a.nextInt();
        int arr[] = new int[a1];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the %d element: ", i + 1);
            arr[i] = a.nextInt();
        }
        System.out.println("array before sorting: ");
        print(arr);
        swapped(arr);
        System.out.println();
        System.out.println("array after sorting..");
        print(arr);
        a.close();
    }
}
