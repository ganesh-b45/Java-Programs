
interface afinalvariable
{
int rollno=10;
void print();
}
class bfinalvariable implements afinalvariable
{

public void print()
{
System.out.println("rollno="+rollno);
}

public  static void main(String args[])
{

bfinalvariable appa=new b();
appa.print();
}
}
