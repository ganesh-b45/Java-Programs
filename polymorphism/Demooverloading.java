class Area
{
int rectArea;
double cirArea;
float sqaArea;
void calArea(int width,int length)
{
rectArea=width*length;
System.out.println("reactangle area="+rectArea);
}
void calArea(double redius)
{
cirArea=3.14*redius*redius;
System.out.println("circle Area="+cirArea);
}
void calArea(float side)
{
sqaArea=side*side;
System.out.println("sqrearea="+sqaArea);

}
}
class Demooverloading
{
public static void main(String args[])
{
Area area=new Area();
area.calArea(6,6);
area.calArea(6f);
area.calArea(6);
}
}