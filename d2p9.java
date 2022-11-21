class d2p9
{
    static void main()
    {
        int i,j,k,n=7;
        for(i=1;i<=((n+1)/2);i++)//row
        {
            for(j=1;j<=(n+1)/2-i;j++)//left space row-i
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)//middle *
            {
                System.out.print("*");
            }
          System.out.println();/* * 1
                                 *** 2
        }                       ***** 3 */  
    }
        for(i=n/2;i>=1;i--) //row
        {
            for(j=1;j<=n/2-i+1;j++) //left space row-i+1 it is staring with one space
            {
                System.out.print(" ");// *** 2
                                      //  *  1
            
            }
            
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
    }
    System.out.println(" ");
}
 
}
}

