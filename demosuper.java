class A
{
int x;
A()
{
   x++;
   System.out.println(x);
}
A(int x)
{
  this.x=x;
  System.out.println(x);
}
class B extends A
{
  int x,y;
B()
{
y++;
x++;
System.out.println(x+" "+y);
}
}
class Demosuper
{
public static void main(String args[])
{
A a=new A(10);
}
}
}