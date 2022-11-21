import java.util.*;
class d1p8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0&&y>0)
        System.out.println("First Quardant");
        else
        if(x<0&&y>0)
         System.out.println("Second Quardant");
        else
        if(x<0&&y<0)
         System.out.println("Third Quardant");
        else
      System.out.println("Fourth Quardant");
    }
}