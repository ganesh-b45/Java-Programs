import java.util.Scanner;
interface a
{
void input();
void print();
}
class b implements a
{
int rollno;
public void input()
{
System.out.println("enter the value");
Scanner sc=new Scanner(System.in);
rollno=sc.nextInt();
}
public void print()
{
System.out.println("rollno="+rollno);
}

public  static void main(String args[])
{

b appa=new b();
appa.input();
appa.print();
}
}