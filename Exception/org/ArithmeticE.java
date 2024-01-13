package Exception.org;

import java.util.Scanner;

public class ArithmeticE {

	public static void main(String[] args) {
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
	}

}
