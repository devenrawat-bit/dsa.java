import java.util.Scanner;
public class count_sort{
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
    public static void count(int arr[])
    {
        //first find the maximum element 
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        //now make a frequency array 
        int freq_arr[]=new int[max+1];
        for(int i=0;i<freq_arr.length;i++)
        {
         freq_arr[arr[i]]++;
        }
        //now pulling the elements form the frequency array 
        // and putting back it to the original array  
        int k=0;
        for(int i=0;i<freq_arr.length;i++)
        {
            for(int j=0;j<freq_arr[i];j++)
            {
                //4 1 5 2 2 5 
                //0 1 2 0 1 2 
                if (freq_arr[i]!=0) {
                    arr[k++]=i;
                }
            }
        }
    }
    
    public static void main(String [] args)
    {
     Scanner a=new Scanner(System.in);
     System.out.println("enter the length of array: ");
     int a1=a.nextInt();
     int arr[]=new int[a1];
     for(int i=0;i<arr.length;i++)
     {
        System.out.printf("enter the %d element: ",i+1);
        arr[i]=a.nextInt();
     }
     System.out.println("array before sorting...");
     print(arr);
     System.out.println();
     count(arr);
     System.out.println("array after sorting...");
     print(arr);
     a.close();
    }
}