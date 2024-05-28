
//we have performOperation (Value v) method and this method accept Value class reference as parameter 
//and we have two child classes of Value first is Add and second is Mul means we can use Add or Mul class object 
//as parameter in performOperation () method we not required to define two different methods for two different operations or parameters.

package Inheritance;
abstract class loose
{
	int a,b;
	void setdetails(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract int getresult();
}
class Add1 extends loose
{
	int getresult()
	{
		return a+b;
	}
}
class Mul1 extends loose
{
	int getresult()
	{
		return a*b;
	}
}
class calculation
{
	void PerformOpe(loose s)
	{
		int result=s.getresult();
		System.out.println("Result is :"+result);
	}
}
public class loose_Coupling {

	public static void main(String[] args) 
	{
		calculation c=new calculation();
		loose s=new Add1();
		s.setdetails(10, 20);
		c.PerformOpe(s);
		s=new Mul1();
		s.setdetails(10, 5);
		c.PerformOpe(s);
	}

}
