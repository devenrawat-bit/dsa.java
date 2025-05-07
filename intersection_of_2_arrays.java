import java.util.Scanner;
import java.util.Arrays;
public class intersection_of_2_arrays {
    public static void input(int n, int arr[],Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.printf("enter the %d number: ", i + 1);
            arr[i]=sc.nextInt();
        }
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // by doing this we know the size we want of the array
        int temp[] = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // check for the duplicates
                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }

        }
        // now copying the array in new array to remove the trailing zeros
        int result[] = new int[k];
        for (int i1 = 0; i1 < k; i1++) {
            result[i1] = temp[i1];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("enter the length of the first array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr1[] = new int[a];

        input(a, arr1,sc);
        System.out.println("enter the length of the second array: ");
        int b = sc.nextInt();
        int arr2[] = new int[b];
        input(b, arr2,sc);
      int ar[]=  intersection(arr1, arr2);
      System.out.println("the array of intersection is : ");
        print(ar);
        sc.close();

    }
}