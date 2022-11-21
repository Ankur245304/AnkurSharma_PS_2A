import java.util.*;
class d2p12
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        System.out.print(i+" ");
        for(i=n-1;i>=1;i--)
        System.out.print(i+ " ");
        System.out.println();
        for(i=n-1;i>=1;i--)//row
        {
            for(j=1;j<=i;j++)//left side
            {
                System.out.print(j+" ");
            }
            for(j=1;j<=2*(n-i)-1;j++)/*space 6-0
                                             5-1---2*(6-5)-1=1          
                                             4-3--2*(6-4)-1=3 */                                                            
            
            {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--)//right side
            {
                System.out.print(" "+j);
            }
            
            System.out.println();
        }
    }
}