abstract class Figure
{
int dim1,dim2;
Figure (int dim1,int dim2)
{
this.dim1=dim1;
this.dim2=dim2;
}

abstract double calArea();
}
class Rectangle extends Figure
{
 double rectArea;
Rectangle(int width,int length)
{
super(width,length);
}
double calArea()
{
rectArea=dim1*dim2;
return rectArea;
}
}
class Tringle extends Figure
{
Tringle(int side1,int side2)
{
super(side1,side2);
}

double calArea()
{
return dim1*dim2/2;
}
}
class DemoAbstract
{
public static void main(String args[])
{
Figure fig;
fig=new Rectangle(7,5);
System.out.println("rectangle area is="+fig.calArea());
fig=new Tringle(11,13);
System.out.println("tringle area is="+fig.calArea());
}
}
