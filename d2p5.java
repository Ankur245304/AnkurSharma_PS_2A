import java.util.*;
class d2p5
{
    static void main(String args[])
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)//row
        {        
            for(j=i;j<=n;j++)//col
            {
              char ch=(char)(j+64);  //64+5=E
                System.out.print(ch);
            }
            System.out.println();}
        }
    }