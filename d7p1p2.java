import java.util.*;
class d7p1p2
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
d7p1p2 obj=new d7p1p2();
obj.len(s);
obj.reverse(s);
    }
    void len(String s)
    {
                s=s+'.';int i=0,len=0;;
        for(char ch=s.charAt(0);ch!='.';ch=s.charAt(i))
        {
            len++;
            i++;
        }
        System.out.print("length of string="+len);
    }
    void reverse(String s)
    {
        int len=s.length();String s2="";
        for(int i=len-1;i>=0;i--)
        s2=s2+s.charAt(i);
        System.out.println("Reverse String="+s2);
        if(s2.equals(s))
        System.out.println("Palindrome String");
    }
}