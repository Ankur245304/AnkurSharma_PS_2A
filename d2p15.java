import java.util.*;
class d2p15
{
static void main(String args[])
{
    d2p15 obj=new d2p15();
    String ans=obj.count(5);
    System.out.print(ans);
}
String count(int n)
{
    if(n==1)
    return "1";
    if(n==2)
    return "11";
    String s=count(n-1);
    String res="";
    int c=0,i,l=s.length();
    for(i=0;i<l;i++){
        c++;
        if(i==l-1||s.charAt(i)!=s.charAt(i+1))
        {
            res=res+c+s.charAt(i);
            c=0;
        }
      
    }
      return res;
}
}


