package Constructor;
class coverloaded
{
	coverloaded(int a) 
	{
		System.out.println("THE int value is:"+a);
	}
	coverloaded(Float f) {
		System.out.println("THe float value is:"+f);
	}
}
public class overloaded_Constructor {

	public static void main(String[] args) {
		coverloaded o=new coverloaded(10);
		coverloaded o1=new coverloaded(3.5f);

	}

}
