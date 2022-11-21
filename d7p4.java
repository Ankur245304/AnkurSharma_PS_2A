import java.util.*;
class d7p4
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+".";int w=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '||s.charAt(i)=='.')
            w++;
        }
        System.out.print("No of words="+w);
    }
}