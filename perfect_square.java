import java.util.Scanner;
public class perfect_square
{
    public static boolean is_square(int num)
    {
        int start=0;
        int end=num;
        while (start<=end) 
        {
            int mid=start+(end-start)/2;
            int value=mid*mid;
         if (value==num) {
            return true;
         }
         else if (value>num) {
            end=mid-1;
         }
         else
         {
             start=mid+1;
         }
        }
     return false;
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("enter the numnber you want to find is perfect square or not: ");
        int ip=a.nextInt();
        boolean ans=is_square(ip);
        if (ans) {
            System.out.println("yes the number is perfect square");
        }
        else{
            System.out.println("no the number is not the perfect square");
        }
        a.close();
    }
}
