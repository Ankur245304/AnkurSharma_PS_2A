import java.util.*;
class d3p4
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int i,c;
        double sum=0,p;
        for(i=0;i<=n;i++)
        {
            d3p4 obj=new d3p4();
            c=obj.fact(i);
            p=Math.pow(x,i);
            if(i%2==0)
            sum=sum-p/c;
            else
            sum=sum+ p/c;
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