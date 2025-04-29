import java.util.Scanner;

public class third_max_element {
    public static int thirdMax(int[] nums) {
        // Bubble Sort to sort the array in descending order
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        // Remove duplicates and find the third distinct maximum
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                count++;
            if (count == 3)
                return nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number of element: ");
        int a1 = a.nextInt();
        int arr[] = new int[a1];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("enter the %d element: ", i + 1);
            arr[i] = a.nextInt();
        }
        int ans = thirdMax(arr);
        System.out.println(ans);
        a.close();

    }

}
