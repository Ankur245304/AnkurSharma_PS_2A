import java.util.*;
class d6p6
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two String\n");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int count[]=new int[26];int i,sum=0;
        for(i=0;i<s1.length();i++)
        {
            count[s1.charAt(i)-'a']++;
        }
        for(i=0;i<s2.length();i++)
        {
            count[s2.charAt(i)-'a']--;
        }
for(i=0;i<26;i++)
sum=sum+Math.abs(count[i]);
System.out.println(sum);        
    }
}