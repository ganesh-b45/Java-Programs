package Inheritance;
class x
{
	int a ,b;
	void setvalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class Add extends x
{	
	int getAdd()
	{
		return a+b;
	}
}
class Mul extends x
{
	int getMul()
	{
		return a*b;
	}
}
public class CalcualteApp {

	public static void main(String[] args) {
		
		Mul m=new Mul();
		m.setvalue(10, 5);
		int result=m.getMul();
		System.out.println("THE MULTIPLACATION IS:"+result);
		Add a=new Add();
		a.setvalue(10, 33);
		result=a.getAdd();
		System.out.println("THE ADDITION IS:"+result);
	}

}
