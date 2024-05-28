class singleinheritance
{
void print()
{
System.out.println("ganesh");
}
}
class b extends singleinheritance
{
void print1()
{
System.out.println("bellale");
}
}
class demoa
{
public static void main(String args[])
{
b a=new b();
a.print();
a.print1();
}
}