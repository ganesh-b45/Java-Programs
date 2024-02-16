class Add
{   int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getResult() {
		return a+b;
	}
}
class Mul{
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
{   void performOperation(Add ad) {
		int result=ad.getResult();
		System.out.println("Addition is "+result);
	}
void performOperation(Mul m) {
	int result=m.getResult();
	System.out.println("Addition is "+result);
}
}
public class TestCouplingByMOveroding {
	public static void main(String[] args) {
		Calc c = new Calc();
		Add ad = new Add();
		ad.setValue(10,20);
		c.performOperation(ad); //pass Add object as parameter
		Mul m = new Mul();
		m.setValue(5, 4);
		c.performOperation(m); //pass Mul object as parameter
	}
}
