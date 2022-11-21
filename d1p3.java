import java.util.*;
class d1p3
{
    void main(String srgs[])
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Vowels");
        }
        else
        if(ch>='0'&&ch<='9')
        System.out.println("Numbers");
        else
        System.out.println("Consonants");
    }
}
