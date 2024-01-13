package oops.org;


abstract class value
{
	int x,y;
	void setvalues(int x ,int y)
	{
		this.x=x;
		this.y=y;
	}
	abstract int getresult();
}
class add extends value
{
	int getresult() {
		return x+y;
	}
}

class mul extends value
{
	int getresult() {
		return x*y;
	}
}
public class Dynamic_Polt {

	public static void main(String[] args) {
		value v=new add();
		v.setvalues(10, 200);
		int result=v.getresult();
		System.out.println("the result is"+ result);
		v=new mul();
		v.setvalues(2, 4);
		result=v.getresult();
		System.out.println("the mul is"+ " " +result);

	}

}
