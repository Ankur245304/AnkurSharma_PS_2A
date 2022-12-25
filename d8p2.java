import java.util.*;
class d8p2
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
    int s=(int)Math.pow(a,b);int c=0;
    while(s>0)
    {
       int r=s%10;
       s=s/10;
       c++;
       if(c==k)
       System.out.print(r);
       
    }
    }
}