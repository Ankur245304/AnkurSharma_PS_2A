import java.util.*;
class d7p6
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        d7p6 obj=new d7p6();
     
           obj.compare(s1,s2);
    }
    void compare(String s1,String s2)
    {int f=0;
        if(s1.length()==s2.length())
        {
           for(int i=0;i<s1.length();i++)
           {
               if(s1.charAt(i)==s2.charAt(i))
               f=1;
               else
               break;
           }
           if(f==1)
           System.out.print("Equal");
        }
        else
        System.out.print("Not Equal");
    }
}