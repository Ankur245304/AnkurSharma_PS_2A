import java.util.*;
class d1p6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
    if(a==b&&b==c)
    {
        System.out.println("Equilateral Triangle");
    }
    else
    if(a==b||b==c||c==a)
    {
        System.out.println("Issocles Triangle");
    }
    else 
    System.out.println("Scalene Triangle");
}
}