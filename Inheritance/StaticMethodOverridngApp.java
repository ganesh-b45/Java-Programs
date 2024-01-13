package Inheritance;
class M
{
	static void show()
	{
		System.out.println("Im a parent method");
	}
}
class N extends M
{
	static void show()
	{
		System.out.println("im child method");
	}
}
public class StaticMethodOverridngApp {

	public static void main(String[] args) 
	{
		M m=new N();
		m.show();

		
		

	}

}
