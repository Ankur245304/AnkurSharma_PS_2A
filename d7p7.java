import java.util.*;
class d7p7
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        d7p7 obj=new d7p7();
        obj.concat(s1,s2);
    }
    void concat(String s1,String s2){
        s1=s1;
        s2=s2+".";
      String  s3=s1;int i=0;
        for(char ch=s2.charAt(i);ch!='.';ch=s2.charAt(i)){
            s3=s3+ch;
            i++;
        }
        System.out.print(s3);
    }
}