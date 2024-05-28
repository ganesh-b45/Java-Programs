
  //utility class means class cant create its object .it contain only static meathod as well as
  //it contain only private constructor

package Constructor;
class b
{
	private b()
	{
	
	}
	static void show()
	{
		System.out.println("im method of class b");
	}
	
}

public class utility_class {

	public static void main(String[] args) {
		b.show();
		
	}

}
