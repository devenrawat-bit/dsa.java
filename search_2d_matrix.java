import java.util.Scanner;

public class search_2d_matrix {
    public static boolean is_present(int arr[][],int target)
    {
        int n=arr.length;
        int m=arr[0].length;
        int start=0;
        int end=n*m-1;
        //the matrix is of 3*4 
        //n=3 and m=4
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int mid_ele=arr[mid/m][mid%m];
            if(mid_ele==target)
             return true;
            else if(mid_ele>target)
                end=mid-1;
            else start=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
      System.out.print("enter the number of the rows: ");
      int a1=a.nextInt();
      System.out.print("enter the number of columns: ");
      int b1=a.nextInt();
      int arr[][]=new int [a1][b1];
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr[i].length;j++)
        {
         System.out.printf("enter the %d row element and %d column number: ",i+1,j+1);
         arr[i][j]=a.nextInt();
        }
      }
   
      System.out.println("enter the target you want to find: ");
      int tar=a.nextInt();
      boolean ans=is_present(arr, tar);
      if (ans) {
        System.out.println("yes the number is present in the matrix");
      }
      else{
        System.out.println("no the number is not present in the matrix");
      }
      a.close();
    }
}
