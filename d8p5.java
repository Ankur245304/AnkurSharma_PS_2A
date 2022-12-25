import java.util.*;
class d8p5
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        d8p5 obj=new d8p5();
        for(int i=0;i<n;i++)
        {
            int x=obj.leastprime(a[i]);
            System.out.print(x+" ");
        }
        
        
    }
    int leastprime(int n)
    {int f=0;
        if(n%2==0)
        return 2;
        if(n==1)
        return 1;
        else
        for(int i=2;i<=n;i++)
        {
            if(n%i==0){
            f=i;
            break;}
        }
        return f;
    }
}