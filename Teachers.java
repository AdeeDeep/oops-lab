import java.io.*;
class Person
{
    String name;
    String gender;
    String address;
    int age;
    Person(String a,String b,String c,int d)
    {
        name=a;
        gender=b;
        address=c;
        age=d;
    }

}
class Employee extends Person
{
    int EmpID;
    String company_name;
    String qualification;
    double salary;
    Employee(String a,String b,String c,int d,int e,String f,String g,double h)
    {
        super(a,b,c,d);
        EmpID=e;
        company_name=f;
        qualification=g;
        salary=h;

    }
}
class Teachers extends Employee
{
    String subject;
    String dept;
    int teacher_ID;
    Teachers(String a,String b,String c,int d,int e,String f,String g,double h,String i,String j,int k)
    {
        super(a,b,c,d,e,f,g,h);
        subject=i;
        dept=j;
        teacher_ID=k;
    }
    void display()
    {
        System.out.println("Emp ID:"+EmpID+"\nName:"+name+"\nAge:"+age+"\nGender:"+gender+"\nAddress:"+address+"\nCompany Name:"+company_name+"\nQualification:"+qualification+"\nSalary:"+salary);
        System.out.print("Teacher ID:"+teacher_ID);
        System.out.print("\nDepartment:"+dept);

        System.out.println("\nSubject:"+subject+"\n\n");


    }
    public static void main(String[] args)throws IOException
    {
        int i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n");
        int n=Integer.parseInt(br.readLine());
        Teachers t[]=new Teachers[n];
        for (i=0;i<n;i++)
        {
            System.out.print("Enter details of Teacher :"+i+"\nEmpID:");
            int a=Integer.parseInt(br.readLine());
            System.out.print("Name:");
            String b=br.readLine();
            System.out.print("Age:");
            int c=Integer.parseInt(br.readLine());
            System.out.print("Gender:");
            String d=br.readLine();
            System.out.print("Salary:");
            double e=Double.parseDouble(br.readLine());
            System.out.print("Address:");
            String f=br.readLine();
            System.out.print("Company Name:");
            String g=br.readLine();
            System.out.print("Qualifications:");
            String h=br.readLine();
            System.out.print("Teacher ID:");
            int j=Integer.parseInt(br.readLine());
            System.out.print("Department:");
            String k=br.readLine();
            System.out.print("Subject:");
            String l=br.readLine();
            t[i]=new Teachers(b,d,f,c,a,g,h,e,l,k,j);

        }
        System.out.println("The details of "+n+" teachers are:");
        for (i=0;i<n;i++)
            t[i].display();

    }

}