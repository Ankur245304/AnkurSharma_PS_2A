import java.util.*;
class d2p13
{
    static void main(String args[])
    {
        int n,i,j,max,k,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int a[][]=new int[10][10];
System.out.println("Enter Elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
            a[i][j]=sc.nextInt();
        }
    }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            { min=a[i][j];
                for(k=1;k<n;k++)
                {
                    if(a[j][k]<min)
                    {
                        min=a[j+1][k];
                    }
                }
    a[i][j]=min;
                    // if(a[i][n-1]>a[i+1][0])
                }       // {
                        // max=a[i][n-1];
                        // a[i][n-1]=a[i+1][0];
                        // a[i+1][0]=max;
                // }
    }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

    
            
        
        