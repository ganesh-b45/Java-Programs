abstarct class bike
{
abstarct void run();
}
class honda extends bike
{
void run()
{
System.out.println("ruunnng seffly");
}
public static void main(String args[])
{
bike obj=new honda();
obj.run();
}
}