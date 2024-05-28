class area
{
int rectarea;
double cirarea;
float sqaarea;
void calarea(int width,int length)
{
rectarea=width*length;
System.out.println("rectarea is="+rectarea);
}
void calarea(double redius)
{
cirarea=3.14*redius*redius;
System.out.println("cirarea is="+cirarea );
}
void calarea(float side)
{
sqaarea=side*side;
System.out.println("sqearea is="+ sqaarea);
}
}
class Demooverloading001
{
public static void main(String args[])
{
area ganni=new area();
ganni.calarea(8,8);
ganni.calarea(10f);
ganni.calarea(6);
}
}



