import java.util.*;
class d3p1
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c,sum=0;
        for(i=1;i<=n;i++)
        {
            d3p1 obj=new d3p1();
            c=obj.fact(i);
            sum=sum+c;
        }
        System.out.print(sum);
    }
    int fact(int a)
    {
        if(a==0)
        return 1;
        else if(a==1)
        return 1;
        else
        return a*fact(a-1);
    }
}