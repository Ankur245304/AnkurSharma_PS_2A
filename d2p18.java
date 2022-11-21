class d2p18
{
    static void main(String args[])
    {String s="geeks";int l=s.length();
        char ch[]=new char[l];
        for(int i=0;i<l;i++)
       ch[i]=s.charAt(i);
        
        
        for(int i=l;i>=1;i--)
        {
            for(int j=1;j<=l-i;j++) 
            {
            System.out.print(".");
        }
            for(int j=i;j>=1;j--)
            {
            System.out.print(ch[l-j]);
        } 
            System.out.println();
        }
    }}