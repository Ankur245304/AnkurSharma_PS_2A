import java.util.*;
class d2p11
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)//row
        {
            for(j=1;j<=i;j++)//increasing pyramid
            {
                System.out.print(j);
            }
         for(j=1;j<=2*(n-i);j++)// double space 
         { 
             System.out.print(" ");
            }
            for(j=i;j>=1;j--)//dec pyramid 
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/* ________ j=4(n-i) space =8 n=5,i=1
    ______ 3 space =6
     ____ 2  space =j*2
      __   1   
 
 */