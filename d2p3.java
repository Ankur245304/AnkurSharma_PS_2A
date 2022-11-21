import java.util.*;
class d2p3
{
    static void main()
    {int n,i,j;
        char a,b;
        System.out.println("Enter the value of N");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(i=1;i<=k;i++)
        {n=i;/*1(1,1)n=1
               2 3
               3 4 5
               4 5 6 7*/
            for(j=1;j<=i;j++)
            {
                System.out.print(n);
                n++;
            }
            System.out.println();
    }
   for(a='A';a<='D';a++)
    {char ch='A';
        for(b='A';b<=a;b++)
        {
             
             System.out.print(ch);
             ch++;
            }
            System.out.println();
}
for(i=1;i<=4;i++)
{
    char ch='A';
    for(j=1;j<=i;j++)
    {
        System.out.print(ch);
        ch++;    
}
System.out.println();
}
}
}
    