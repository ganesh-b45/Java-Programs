class ab
{
void add()
{
System.out.println("class name is a and b");
}
}
class a extends ab
{
void add1()
{
System.out.println("class name is a ");
}
}
class c extends ab
{
void add2()
{
System.out.println("class name is  b");
}
}
class testab
{
public static void main(String args[])
{
c b=new a();
c.add();
c.add1();
c.add2();
}
}
