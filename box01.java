class box01
{
int depth;
int width;
int height;
int volume;
void adddepth(int depth)
{
this.depth=depth;
}
void addwidth(int width)
{
this.width=width;
}
void addheight(int height)
{
this.height=height;
}
void display()
{
volume=width*height*depth;
System.out.println("this the volume of box="+volume);
}
public static void main(String args[])
{
box01 ganni=new box01();
ganni.addheight(12);
ganni.addwidth(11);
ganni.adddepth(13);
ganni.display();
}
}
