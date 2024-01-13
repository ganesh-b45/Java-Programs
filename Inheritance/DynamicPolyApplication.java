//what is dynamic polymorphism?
//____________________________________________________________________________
//Dynamic polymorphism means object bounded with functionality at program run time called as dynamic polymorphism 
//means in the case of dynamic polymorphism we change object with parent reference at run time and call overridden of child using parent reference

package Inheritance;
abstract class parent
{
	int x,y;
	void setvalue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	abstract int getresult();
}
class Addi extends parent
{

	@Override
	int getresult() {
		
		return x+y;
	}
}
class Mult extends parent
{
	int getresult() {
		return  x*y;
		
	}
}
public class DynamicPolyApplication {

	public static void main(String[] args) 
	{
		parent p=new Addi();
		p.setvalue(5, 10);
		int result=p.getresult();
		System.out.println("The Additon is %d :"+result);
		p=new Mult();
		p.setvalue(10, 5);
		result=p.getresult();
		System.out.printf("The Multiplacation is %d ",result);
		

	}

}
