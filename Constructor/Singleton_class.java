package Constructor;
class DB
{
	private static DB db=null;
	private DB()
	{
		System.out.println("im singleton class");
	}
	static DB getInstance()
	{
		if(db==null)
		{
			db=new DB();
		}
		return db;
	}
}
public class Singleton_class {

	public static void main(String[] args) {
		DB db1= DB.getInstance();
		DB db2= DB.getInstance()	;
		DB db3=DB.getInstance();
		
		System.out.println("the hashcode of db1 is"+System.identityHashCode(db1));
		System.out.println("the hashcode of db1 is"+System.identityHashCode(db2));
		System.out.println("the hashcode of db1 is"+System.identityHashCode(db3));
		

	}

}
