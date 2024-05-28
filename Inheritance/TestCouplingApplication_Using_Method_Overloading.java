package Inheritance;
class Addition
{   int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getResult() {
		return a+b;
	}
}
class Multiplacation{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getResult() {
		return a*b;
	}
}
class Calc
{   void performOperation(Addition ad) {
		int result=ad.getResult();
		System.out.println("Addition is "+result);
	}
void performOperation(Multiplacation m) {
	int result=m.getResult();
	System.out.println("Addition is "+result);
}
}
public class TestCouplingApplication_Using_Method_Overloading {
	public static void main(String[] args) {
		Calc c = new Calc();
		Addition ad = new Addition();
		ad.setValue(10,20);
		c.performOperation(ad); //pass Add object as parameter
		Multiplacation m = new Multiplacation();
		m.setValue(5, 4);
		c.performOperation(m); //pass Mul object as parameter
	}
}
