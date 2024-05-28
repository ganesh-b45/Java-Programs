class box
{
int width;
int height;
int depth;
int volume;
void addwidth(int width)
{
this.width=width;
}
void addheight(int height)
{
this.height=height;
}
void adddepth(int depth)
{
this.depth=depth;
}
void display()
{
volume=width*height*depth;
System.out.println("volume is="+volume);
}
public static void main(String args[])
{
box ganni=new box();
ganni.addwidth(12);
ganni.addheight(12);
ganni.adddepth(12);
ganni.display();
}
}