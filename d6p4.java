import java.util.*;
class d6p4
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();int i,j;
         int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int t;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
      /*    for(i=0;i<m/2;i++)
        {
            for(j=0;j<n;j++)
            {
                t=arr[i][j];
                arr[i][j]=arr[m-i-1][j];
                arr[m-i-1][j]=t;
            }
        }
          for(i=0;i<m;i++)
        {
            for(j=0;j<n/2;j++)
            {
                t=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=t;
            }
        }
          for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }*/
         for (i = m - 1; i >= 0; i--) {
            for ( j = n - 1; j >= 0; j--)
                System.out.print(arr[i][j] + " ");
  
            System.out.println();
        }
    }
    }

                