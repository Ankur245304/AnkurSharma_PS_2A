import java.util.*;
class d5p7
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int b[]=new int[N];int k=N-1,i;
        for(i=0;i<N;i++)
        arr[i]=sc.nextInt();
        System.out.print("Original Numbers\n");
         for(i=0;i<N;i++)
          System.out.print(arr[i]+" ");
        for(i=0;i<N;i++)
        {
            b[k]=arr[i];
            k--;
        }
          System.out.println("Reversed Matrix");
          for(i=0;i<N;i++)
          System.out.print(b[i]+" ");
         
        
    }
}