class d2p8
{
    static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=4;i++)
        {
            for(j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
            
                
                