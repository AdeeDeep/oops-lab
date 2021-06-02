import java.io.*;
class Employ
{
    int Empid;
    String name;
    double salary;
    String address;
    Employ(int a,String b,double c,String d)
    {
        Empid=a;
        name=b;
        salary=c;
        address=d;
    }
}
class Teacher extends Employ
{
    String department;
    String[] sub;
Teacher(int a,String b,double c,String d,String e, String[] subjects)
{
    super(a,b,c,d);
    department=e;
    sub=subjects.clone();

}
void display()
{
    System.out.print("Details\nEmp ID:"+Empid+"\nName:"+name+"\nSalary:"+salary);
    System.out.println("\nAddress:"+address+"\nDepartment:"+department+"\nSubjects:");
    for(int i=0;i<sub.length;i++)
    {
        System.out.print(sub[i]+" ");
    }

}
public static void main(String[] args)throws IOException
{
    int i;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter n");
    int n=Integer.parseInt(br.readLine());
    Teacher t[]=new Teacher[n];
    for (i=0;i<n;i++)
    {
        System.out.print("Enter details of Teachers:\nEmpID:");
        int a=Integer.parseInt(br.readLine());
        System.out.print("Name:");
        String b=br.readLine();
        System.out.print("Salary:");
        double c=Double.parseDouble(br.readLine());
        System.out.print("Address:");
        String d=br.readLine();
        System.out.print("Department:");
        String e=br.readLine();
        System.out.print("Subjects taught");
        String f=br.readLine();
        String[] subjects=f.split(" ");
        t[i]=new Teacher(a,b,c,d,e,subjects);

    }
    System.out.println("The details of "+n+" teachers are:");
    for (i=0;i<n;i++)
        t[i].display();

}

}