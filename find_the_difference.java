//this is the leetcode problem number (389)
import java.util.Arrays;
//array package include the sort methods
import java.util.Scanner;
public class find_the_difference{
    public static char findTheDifference(String s, String t) {
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        //now loop for the smaller one as if second char array remain we get our answer
        for(int i=0;i<s1.length;i++)
        {
           if(s1[i]!=t1[i])
           {
             return t1[i];
           }
        }
        return t1[t1.length-1];
   }
    public static void main(String[] args) {
        System.out.println("enter the first string that is less than the next string you will enter: ");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("enter the second string which is greater than the first one: ");
        String b=sc.nextLine();
        char ans=findTheDifference(a, b);
        System.out.println("the difference is :"+ans);
        sc.close();
    }
}
