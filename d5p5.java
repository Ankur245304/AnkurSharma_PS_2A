import java.util.*;
class d5p5
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int e=N-1,o=0;
        for(int i=1;i<=N;i++)
        {
            if(i%2==0){
            arr[e]=i;
            e--;
        }
        else{
        arr[o]=i;
        o++;
    }
}
for(int i=0;i<N;i++)
System.out.print(arr[i]+" ");
}
}