import Arith.*;
public class ArithOperations
{
    public static void main(String args[])
    {
        Add a=new Add();
        Sub s=new Sub();
        Div d=new Div();
        Mul m=new Mul();
        System.out.println("Sum="+a.sum(2,98));
        System.out.println("Difference="+s.difference(3,4));
        System.out.println("Product="+m.product(3,9));
        System.out.println("Quotient="+d.quotient(8,4));
    }
}