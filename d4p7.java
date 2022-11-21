class d4p7
{
   public static void main(String args[])
    {d4p7 obj=new d4p7();
        int sum,j;
        for(j=10;j<=999;j++)
        {
            int c=obj.isarm(j);
            if(c==1)
            System.out.print(j+"\t");
            else
            continue;
        }
    }
    int isarm(int n)
    {
       int r,a=n,m=0;
       double sum=0;
       while(n>0){
           r=n%10;
           n=n/10;
           m++;}
           n=a;
       while(n>0){
           r=n%10;
           n=n/10;
           sum=sum+Math.pow(r,m);
       }
        if(sum==a)
        return 1;
        else
        return 0;
    }
}