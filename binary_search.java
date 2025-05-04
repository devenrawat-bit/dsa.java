public class binary_search {
    public static int  bin(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
         while (start<=end) {
            int mid=start+(end-start)/2;
            //use this way to find the mid as it is good for vast array size
            if (arr[mid]==target) {
                return mid;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
         }
         return -1;
         //if no element found return -1
    }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    int ans_ind=bin(arr, 11);
    if (ans_ind>=0) {
        
        System.out.printf("the target is present in %d index ",ans_ind);
    }
    else{
        System.out.println("the element is not present in the array ");
    }
  }    
}
