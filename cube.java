package practice;

public class cube 
{
	int a;
	void setvalue(int x)
	{
		a=x;
	}
	int getcube()
	{
		return a*a*a;
	}

	public static void main(String[] args) 
	{
		cube c=new cube();
		c.setvalue(2);
		int result=c.getcube();
		System.out.println("The cube is :"+result);
	}

}
