import java.util.Scanner;
public class merge_sort {
    // printing the array
    public static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge(int arr[], int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start+i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + 1 + j];
        }
        // now comparing and pushing element into array
        int i = 0;
        int j = 0;
        int k = start;
        while (i <n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        //check if any element left if yes then add as it is in the remaning space 
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
    public static void mergesort(int arr[], int start, int end) {
        if (start >= end) {
            return;//size is 1
        }
        int mid = start + (end - start) / 2;
        mergesort(arr, start, mid);
        mergesort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
    public static void main(String[] args) {
        System.out.print("enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the %d element: ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting...");
        print(arr);
        System.out.println();
        int start = 0;
        int end = arr.length - 1;
        mergesort(arr, start, end);
        System.out.println("array after sorting...");
        print(arr);
        sc.close();
    }
}
