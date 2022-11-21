import java.util.*;
class d1p7
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double t=s.nextDouble();
        if(t<0)
        System.out.println("FReezing weather");
        else if(t>0&&t<10)
                System.out.println("very cold weather");
                 else if(t>10&&t<20)
                System.out.println(" cold weather");
                else if(t>20&&t<30)
                System.out.println("Normal Weather");
                 else if(t>30&&t<40)
                System.out.println("Hot");
                else
                 System.out.println("very Hot");
                }
            }
                
                