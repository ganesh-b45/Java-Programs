class box002
{
int width;
int height;
int depth;
int volume;
void adda(int width)
{
this.width=width;
}
void addb(int height)
{
this.height=height;
}
void addc(int depth)
{
this.depth=depth;
}
void show()
{
volume=height*width*depth;
System.out.println("the volume of box is="+volume);
}
public static void main(String args[])
{
box002 ganni=new box002();
ganni.adda(12);
ganni.addb(13);
ganni.addc(12);
ganni.show();
}
}