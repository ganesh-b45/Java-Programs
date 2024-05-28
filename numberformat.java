import java.util.*;
class numberformat
{
  public static void main(String args[])
  {
    int number;
	try
	{
	 Scanner sc=new Scanner(System.in);
	 
	 number=sc.nextInt();
	 System.out.println(number);
	 
	}
	catch(Exception e )
	{
	  System.out.println(""+e);
	}
  }
}