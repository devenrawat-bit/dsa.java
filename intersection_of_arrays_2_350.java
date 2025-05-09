//350 here is the number of leetcode problem 
import java.util.Scanner;
import java.util.Arrays;

public class intersection_of_arrays_2_350 {
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void input(int n, int arr[],Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the %d number: ", i + 1);
            arr[i]=sc.nextInt();
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        // first we will sort the array
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int arr[] = new int[Math.max(nums1.length, nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                arr[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        // removing the trailing zeros
        int ans[] = new int[k];
        for (int c = 0; c < k; c++) {
            ans[c] = arr[c];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("enter the length of the first array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr1[] = new int[a];
        input(a, arr1, sc);
        System.out.println("enter the length of the second array: ");
        int b = sc.nextInt();
        int arr2[] = new int[b];
        input(b, arr2, sc);
        int ar[] = intersect(arr1, arr2);
        System.out.println("the array of intersection is : ");
        print(ar);
        sc.close();

    }
}
