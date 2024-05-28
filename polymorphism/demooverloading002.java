class area
{
int rectarea;
double cirarea;
float squrarea;
void calarea(int width,int length)
{
rectarea=width*length;
System.out.println("reactarea is="+rectarea);
}
void calarea(double redius)
{
cirarea=3.14*redius*redius;
System.out.println("cirarea is="+cirarea);
}
void calarea(float side)
{
squrarea=side*side;
System.out.println("suararea is="+squrarea);
}
}
class demooverloading002
{
public static void main(String args[])
{
area ganni=new area();
ganni.calarea(3,6);
ganni.calarea(5f);
ganni.calarea(10);
}
}