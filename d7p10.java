import java.util.*;
class d7p10
{
    static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        int ch[]=new int[26];char ch1;
        for(int i=0;i<s1.length();i++)
        {
            ch[s1.charAt(i)-'a']++;
        }int pos=0;
        for(int i=0;i<26;i++)
        {
            if(ch[i]!=0){
                pos=97+i;
            ch1=((char)pos);
            System.out.println("Frequency of "+ch1+" is "+ch[i]);
        }
        
    }
       
    }
}