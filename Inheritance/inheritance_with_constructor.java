package Inheritance;
class q
{
	q()
	{
		System.out.println("I'm constructor of parent class");
	}
}
class r extends q
{
	public r() {
		System.out.println("I'm constructor of child class");
	}
}
public class inheritance_with_constructor {

	public static void main(String[] args) {
		r o=new r();
		
		
	}

}
