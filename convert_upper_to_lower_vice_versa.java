import java.util.*;
public class convert_upper_to_lower_vice_versa {
    public static StringBuilder toggle(StringBuilder a)
    {
     int len=a.length();
     for(int i=0;i<len;i++)
     {
        boolean flag=true;//for the capital one 
        char ch=a.charAt(i);
        int num=(int)ch;
        if (num>=97) {
            //means it is a small number add
            flag=false;
        }
        if (flag==true) {
            num+=32;
            //then this will become small 
            char dh=(char)num;
            a.setCharAt(i, dh);
        }
        else{
            //when small
            num-=32;//will convert then to capital
            char yo=(char)num;
            a.setCharAt(i, yo);
        }
     }
     return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        StringBuilder a=new StringBuilder(sc.nextLine());
        StringBuilder ans=toggle(a);
        System.out.println(ans);
        sc.close();

    }
}
