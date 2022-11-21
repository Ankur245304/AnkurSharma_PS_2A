import java.util.*;
class d7p5
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();String s2="";int i;
        for(i=0;i<s.length();i++)
        {char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            s2=s2+(char)((int)ch-32);
            else
            s2=s2+(char)((int)ch+32);       
                    }System.out.print("Final="+s2);
    }
}