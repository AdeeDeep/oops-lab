import Graphics.*;
import java.util.*;
public class AreaFigures implements Square,Triangle
{
public int area_sq(int a)
{
return a*a;
}
public double area_tri(int b,int h)
 {
        return (0.5*h*b);
    }
    public static void main(String args[])
    {
int choice;
char ch;
System.out.println("Menu:\n1.Circle\n2.Rectangle\n3.Suare\n4.Triangle\n5.Exit\n");

   AreaFigures a=new AreaFigures();

Scanner sc=new Scanner(System.in);

do
{
System.out.println("Enter the choice");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the radius");
double radius=sc.nextDouble();
Circle c=new Circle();
 System.out.println("Area of the Circle is"+c.area(radius));
       
break;
case 2:
System.out.println("Enter the length and breadth of rectangle");
int l=sc.nextInt();
int b=sc.nextInt();
  Rectangle r=new Rectangle();
System.out.println("Area of the Rectangle is"+r.area(l,b));
       
break;
case 3:
System.out.println("Enter the base and height of triangle");
int base=sc.nextInt();
int height=sc.nextInt();

        System.out.println("Area of the Triangle is"+a.area_tri(base,height));
    
break;
case 4:
System.out.println("Enter the side of square");
int side=sc.nextInt();
System.out.println("Area of the Square is"+a.area_sq(side));
       break;

case 5:
System.exit(0);
break;
default:
System.out.println("Invalid choice");
}
 
        System.out.println("Do you want to continue?");
           ch=sc.next().charAt(0);
   }while(ch=='Y');   
     }
}