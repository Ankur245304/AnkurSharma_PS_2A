import java.util.*;
class d3p8
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+(i*(i+1)*(i+2));
        }
        System.out.print("Sum of Series ="+sum);
    }
}