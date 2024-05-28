import java.util.*;
class exception
{ 
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	try
	{
		int c=a/b;
		System.out.println("program executed ");
		
	}
	catch (ArithmeticException e) {
		System.out.println("erroe is"+e);
	}
	  System.out.println("ArrayindexBoundException");
		
	 try {
		  int arr[]=new int[2];
		arr[2]=100;
		
	} catch (Exception e) {
		System.err.println("The Exception is: "+e);
	}
	
	
	System.out.println("NullPointerException");
	try{
     String s=null;
	 System.out.println(s.length());
	}
	 catch (Exception e)
	 {
	System.err.println("The Exception is: "+e);
	
	 }
 }
}