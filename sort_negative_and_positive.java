import java.util.Scanner;
public class sort_negative_and_positive {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
   public static void sort(int arr[])
   {
    int i=0;
    int j=arr.length-1;
    while (i<j) {
        //-13 20 7 0 -4 -13 11 -5 -13
        while (arr[i]<0) {
            i++;
        }
        while (arr[j]>=0) {
            j--;
        }
        if (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }  }}
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
        sort(arr); 
        System.out.println();
        System.out.println("array after sorting...");
        print(arr);
        a.close();
    }
}
