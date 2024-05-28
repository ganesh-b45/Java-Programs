package Constructor;
class p
{
	int a,sal;
	String name;
	public p(int a, int sal, String name) {
		this.a = a;
		this.sal = sal;
		this.name = name;
	}
	void details()	
	{
		System.out.println("The a is:"+a);
		System.out.println("The sal is:"+sal);
		System.out.println("The name is: "+name);
	}
	
}
public class parameterized_constuctor {

	public static void main(String[] args) {
		p obj=new p(1,1000,"Ganesh");
		obj.details();
		

	}

}
