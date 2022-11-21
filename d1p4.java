import java.util.*;
class d1p4
{
    void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int yr=s.nextInt();
        if(((yr%4==0)&&(yr%100!=0))||yr%400==0)
        System.out.println("Leap Year");
    }
}
        