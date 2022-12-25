import java.util.*;
class d8p3
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0;
       
           
          /*  while(n>0||s>9)
            {
                if(n==0){
                n=s;
                s=0;
            }
                r=n%10;
                s=s+r;
                n=n/10;
            }*/
            if(n==0)
            System.out.print(0);
            else
            if(n%9==0)
            System.out.print("9");
            else
            System.out.print(n%9);
    }
        
        
}