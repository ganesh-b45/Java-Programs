abstract class shape
{
  abstract void draw();
}
class rectangle extends shape
{
void draw();
{
System.out.println("dont fair");
}
}
class circle extends shape
{
void draw()
{
System.out.println("all is well");
}
}
class testshape
{
public static void main(String args[])
{
shape s=new circle();
s.draw();
}
}