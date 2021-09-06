import java.util.*;
public class StackExample
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        Stack<String> a=new Stack<String>();
        System.out.println("Menu:1.Push\n2.Pop\n3.Peek\n4.Search\n5.Size\n6.Traverse\n7.Exit\n");
        char choice;
        int i,ch;
        String s;
        do {
            System.out.println("Enter choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter string:");
                     s = sc.next();
                    a.push(s);
                    System.out.println(a);
                    break;
                case 2:
                    System.out.println("Popped Element is " + a.pop());
                    break;
                case 3:
                    System.out.println("Topmost Element is " + a.peek());
                    break;
                case 4:
                    System.out.println("Enter string to be searched:");
                     s = sc.next();
                     int x=a.search(s);
                     if(x==-1)
                    System.out.println("Element not found");
                     else
                         System.out.println("Element found at index "+x);
                    break;
                case 5:
                    System.out.println("Size of the stack is "+a.size());
                    break;
                case 6:
                    System.out.println("The stack is:");
                    for (String k : a)
                        System.out.println(k);
                    break;
                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
            System.out.println("Do you want to continue?");
            choice=sc.next().charAt(0);
        }while (choice=='Y');
    }
}