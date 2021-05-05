class Room
{
    int roomNo;
    String roomtype;
    int roomArea;
    Room()
    {
        roomNo=0;
        roomtype="Drawing Room";
        roomArea=0;
    }
    Room(int a,String b,int c)
    {
        roomArea=c;
        roomtype=b;
        roomNo=a;
    }
    void display()
    {
        System.out.println("Room No:"+roomNo);
        System.out.println("Room Type:"+roomtype);
        System.out.println("Room Area:"+roomArea+"sq: meters");
    }
    public static void main(String[] args)
    {
        Room r1=new Room();
        Room r2=new Room(21,"Study Room",500);
        r1.display();
        r2.display();
    }
}