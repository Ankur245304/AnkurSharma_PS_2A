import java.util.*;
class d6p8
{
    static void main()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter size of 1:");
   int m=sc.nextInt();
 int a[]=new int[m];   int i,j,flag=0;
   System.out.println("Enter elements:");
for(i=0;i<m;i++)
a[i]=sc.nextInt();
 System.out.println("Enter size of 2:");
   int n=sc.nextInt();
 int b[]=new int[n];   
   System.out.println("Enter elements:");
for(i=0;i<n;i++)
b[i]=sc.nextInt();
 System.out.println("Common Elements");
 for(i=0;i<m;i++)
 {
     for(j=0;j<n;j++)
     {
         if(a[i]!=b[j])
         continue;
         else
         flag=1;
     }
     if(flag==1)
     System.out.print(a[i]+" ");
}
}
}