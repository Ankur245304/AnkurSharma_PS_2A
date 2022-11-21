import java.util.*;
class d2p17
{
    static void main(String args[])
    {
        int i,j,k,n,r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        for(i=1;i<=r;i++)//row
        {n=1;
            
    for(k=1;k<=i;k++)//upto middle
    {
       System.out.print(n);
        n++;
    }
    n--;
    for(j=1;j<=i-1;j++)//right digit
    {n--;
        System.out.print(n);
           }
    System.out.print(" ");
}
}
}