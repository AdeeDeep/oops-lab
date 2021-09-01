import Arith.*;
import java.util.*;
public class ArithOperations
{
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers");
int x=sc.nextInt();
int y=sc.nextInt();
        Add a=new Add();
        Sub s=new Sub();
        Div d=new Div();
        Mul m=new Mul();
        System.out.println("Sum="+a.sum(x,y));
        System.out.println("Difference="+s.difference(x,y));
        System.out.println("Product="+m.product(x,y));
        System.out.println("Quotient="+d.quotient(x,y));
    }
}
