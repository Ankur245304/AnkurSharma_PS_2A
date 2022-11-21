import java.util.*;
class d1p1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int bs=s.nextInt();
        char g=s.next().charAt(0);
        double tot,hra,da,pf;
        int allow;
        if(g=='A')
        allow=1700;
        else
        if(g=='B')
        allow=1500;
        else
        allow=1300;
        hra=0.2*bs;
        da=0.5*bs;
        pf=0.11*bs;
        tot=bs+hra+da+allow-pf;
        tot=Math.round(tot);
        System.out.println((int)tot);
    }
}