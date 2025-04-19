import java.util.Scanner;

public class search_2d_matrix_2 {
    public static boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length;//5-row
        int m=arr[0].length;//5-give column
        int start=0;
        int end=m-1;
        while(start<n && end>=0)
        //start will not go above the number of rows, error will be encountered as we are doing ++ in the start
        //end will not go beyond the 0 as we are doing -- in the end 
        {
            if(target==arr[start][end])
             return true;
            else if(arr[start][end]<target)
                start++;
            else{
                end--;
            }
        } return false;
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
      System.out.println("enter the target: ");
      int tar=a.nextInt();
      boolean ans=searchMatrix(arr, tar);
      if (ans) {
        System.out.println("target is presented in the matrix");
      }
      else{
        System.out.println("no the target is not presented in the matrix");
      }
      a.close();
      
    }
}