package Exception.org;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInputMismatchApp {

	public static void main(String[] args)
		{ 
			try{ 
	          Scanner xyz  = new Scanner(System.in);
	          int a,b,c;
		  System.out.println("enter two values");
		  a=xyz.nextInt();
		  b=xyz.nextInt();
		  c=a+b;
		  System.out.println("Addition is  "+c);
	       }
	       catch(InputMismatchException ex)
	       { System.out.println("Error is "+ex);
	       }


	}

}
