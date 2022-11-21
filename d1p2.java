import java.util.*;
class d1p2
{
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 Numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+"is Largest");
            }
            else
            System.out.println(c+"is Largest");
        }
        else
        if(b>a)
        {
            if(b>c)
            {
                System.out.println(b+"is Largest");
            }
            else
            System.out.println(c+"is Largest");
        }
        else
         System.out.println(c+"is Largest");
        }
    }