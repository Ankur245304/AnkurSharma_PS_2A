import java.util.*;
class d2p16
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=2*n-2;
        
        for(int i=0;i<=k;i++)
        {
            for(int j=0;j<=k;j++)
            {
                d2p16 obj=new d2p16();
                
               int y=obj.min(j,i);//adress from all four corners mein se min nikalna padega
               int x=obj.min(k-j,k-i);
                x=obj.min(x,y);
               System.out.print(n-x);
            }
            System.out.println();
        }
    }
    int min(int a,int b)//min find 
    {
       int m=a;
        if(b<a)
        m=b;
       return m;
}
}
                
                