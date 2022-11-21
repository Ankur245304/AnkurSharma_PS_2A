import java.util.*;
class d5p4
{
   static void main()
    {
    Scanner sc=new Scanner(System.in);
    d5p4 obj =new d5p4();
    int i,j;
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    for( i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(a[i]<k)
        {
            int x=obj.extract(a[i]);
            if(x==1)
            System.out.print(a[i]+"\t");
            else 
            continue;

        }
    }
}
int extract(int n)
{int t[]=new int[10];
    int i=0,p=0;
int r;
    while(n>0)
    {
       r=n%10;
       t[i]= r;
       i++;
        n=n/10;
    }int k=i;
    for(i=0;i<k;i++)
    {
        if(Math.abs(t[i]-t[i+1])==1)
        p=1;
        else
        break;
    }
   if(p==1)
    return 1;
    else
    return 0;
}
}