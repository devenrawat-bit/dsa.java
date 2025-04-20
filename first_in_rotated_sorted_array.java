//find the first number index in the rotated sorted array 
public class first_in_rotated_sorted_array {
    public static int firsa(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid]<arr[end]) {
              end=mid-1;
                ans=mid;
            }
            else{
                start=mid+1;    
            }
        }
        return ans;
    }




    // class Solution {
    //     public int findMin(int[] nums) {
    //        int start=0;
    //        int end=nums.length-1;
    //         while (start < end) {
    //             int mid = start + (end - start) / 2;
    //             // If mid element is greater than end min must be on the right side
    //             if (nums[mid] > nums[end]) {
    //                 start = mid + 1;
    //             } else {
    //                 end = mid;
    //             }
    //         }
    //         // When start == end our index is the answer 
    //         return nums[start];
    //     }
    // }


    
    public static void main(String[] args) {
       int arr[]={3,4,5,6,7,8,0,1,2};
       int fans=firsa(arr); 
       System.out.println(fans);
    }
}
