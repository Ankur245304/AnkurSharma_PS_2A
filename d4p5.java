class d4p5
{
   public static void main(String args[])
    {d4p5 obj=new d4p5();
        int n=6,sum,j;
        for(j=1;j<n;j++)
        {
            
            int c=obj.isperfect(j);
            if(c==1)
            System.out.print(j);
        }
    }
    int isperfect(int n)
    {
        int sum=0,i;
        for(i=1;i<=n/2;i++){
        if(n%i==0)
        sum=sum+i;
    }
        if(sum==n)
        return 1;
        else
        return 0;
    }
}