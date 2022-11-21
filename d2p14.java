import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class d2p14{
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      int i,j;
      if(n>2&&n<=20)
      {
          for(i=1;i<=n;i++)
          {
              if(i==1||i==n)
              {
                  for(j=1;j<=n;j++)
                  System.out.print("*");
              }
              else
              {
              for(j=1;j<=n-i;j++)
{
    System.out.print(" ");
}
System.out.print("*");
          }
          System.out.println();
      }
    }
}
}