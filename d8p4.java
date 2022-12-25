import java.util.*;
class d8p4
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[26];int i=0;int t=0,r,mid=0,s1=0,s2=0;
        while(n>0)
        {
           r=n%10;
            a[i]=r;
            n=n/10;
            t++;
            i++;
                    }
                    if(t%2==0){
                        System.out.print("Not Balanced Digit");
                    System.exit(0);}
                    else
                     mid=(t+1)/2;
                    for(i=0;i<n;i++)
                    {
                        if(i<mid)
                        s1=s1+a[i];
                        else if(i>mid)
                        s2=s2+a[i];
                        else
                        continue;
                    }
                    if(s1==s2)
                    System.out.print("Balanced Digit");
                    else
                    System.out.print("Not Balanced Digit");
    }
}