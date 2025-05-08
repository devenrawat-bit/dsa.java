//164 here is the question number in the leetcode platform
import java.util.Arrays;
import java.util.Scanner;

public class find_maximum_gap_164 {
    public static int maximumGap(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Arrays.sort(nums);
        // 1 3 6 9
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i] - nums[i - 1];
            if (ans < temp)
                ans = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("enter the length of the array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the %d element: " , i + 1);
            arr[i] = sc.nextInt();
        }
        int ans = maximumGap(arr);
        System.out.printf("the maximum gap in the array is: %d", ans);
        sc.close();
    }
    //note this code has time complexity of this solution is nlogn and the space complexity is o(n);
}
