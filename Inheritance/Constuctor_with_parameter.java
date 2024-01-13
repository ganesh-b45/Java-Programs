package Inheritance;

//When we have parameter in parent class then parent constructor not executed 
//before child class constructor and for that we have super () constructor in JAVA.

class y
{
	y(int x)
	{
		System.out.println("The Value of x is:"+x);
	}
}
class z extends y{
	z()
	{
		super(100);
		System.out.println("i'm a child class consructor");
	}
}
public class Constuctor_with_parameter {

	public static void main(String[] args) {
		z o=new z();
		

	}

}
