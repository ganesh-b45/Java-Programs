package pack;

public class Star
{
public void ak()
{
System.out.println("Hellow");
}
}

package mypack;
import pack.*;

class S
{
public static void main(String s[])
{
Star obj=new Star();
obj.ak();
}
}