import java.util.Scanner;
public class quick_sort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //find the partition by the hoares partition scheme  
    public static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int count = 0;
        //find all the number smaller and equal to the pivot element
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        
        // 3,4,2,6,7
        // swap and place the pivot at right place
        int pivot_index = start + count;
        int temp;
        temp = arr[start];
        arr[start] = arr[pivot_index];
        arr[pivot_index] = temp;
        // 4,3,2,6,7
        // now check that at left of the pivot all the elements are small and at the
        // right all are bigger then the pivot
        int i = start;
        int j = end;
        while (i < pivot_index && j > pivot_index) {
            while (arr[i] <= pivot) {
                i++;
                //here equals comes because it can also be the equal number 
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivot_index && j > pivot_index) {
                int tempo;
                tempo = arr[i];
                arr[i] = arr[j];
                arr[j] = tempo;
                i++;
                j--;
            }
        }
        return pivot_index;
    }
    public static void quick_sort(int arr[], int start, int end) {
        // base case for recursion
        if (start >= end)
            return;
            //8 8 1 7 5 4 3 2 
        else {
            int par = partition(arr, start, end);
            quick_sort(arr, start, par - 1);
            quick_sort(arr, par + 1, end);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the number of elements: ");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the %d element: ", i + 1);
            arr[i] = cs.nextInt();
        }
        System.out.println("array before sorting...");
        print(arr);
        System.out.println();
        int n = arr.length;
        quick_sort(arr, 0, n-1);
        System.out.println("array after sorting...");
        print(arr);
        cs.close();
    }
}
