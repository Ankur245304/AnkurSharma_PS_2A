import java.util.*;
class d7p13
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int m=sc.nextInt();
        String s[]=new String[m];
        for(int i=0;i<m;i++)
        {
            s[i]=sc.nextLine();
        }String t="";
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(s[j].compareTo(s[j+1])>0)//s[j]>s[j+1] so compareTo will give greater than zero value

                {
                    t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;              
                }
            }
        }
        for(int i=0;i<m;i++)
            System.out.println(s[i]+"\n");

    }
}