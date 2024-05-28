package practice;

public class factorial 
{
	int x;
	void setvalue(int x)
	{
		this.x=x;
	}
	int getfact()
	{
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		factorial f=new factorial();
		f.setvalue(4);
		int result=f.getfact();
		System.out.println("The factorial is :"+result);

	}

}
