import java.util.*;
class d3p7
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c;
        double sum=0;
        for(i=1;i<=n;i++)
        {
            d3p7 obj=new d3p7();
            c=obj.fact(2*i-1);
            if(i%2==0)
            sum=sum-i/c;
            else
            sum=sum+i/c;
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