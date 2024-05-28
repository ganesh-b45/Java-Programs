package Constructor;
class A
{
	A()
	{
		this(5);
		System.out.println("i'm defalut con");
	}
	A(int x)
	{
		this(3.5f);
		System.out.println("im integer con"+x);
	}
	A(float f)
	{
		System.out.println("im float con"+f);
	}
	
}
public class this_constructor {

	public static void main(String[] args) {
		A a=new A();
		

	}

}
