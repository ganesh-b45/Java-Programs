package practice;

import java.util.Scanner;

public class checkduck 
{
	int no;
    public checkduck(int no)
    {
    	this.no=no;
    }
    boolean isduckno()
    {
    	
    	for(int i=0;i<=no;i++)
    	{
    		while(no!=0)
    		{
    			int rem=no%10;
    			no=no/10;
    			if(rem==0)
        		{
        			return true;
        		}
    		}
    	}
    	return false;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that you wanna check");
		int n=sc.nextInt();
		checkduck c=new checkduck(n);
		boolean r=c.isduckno();
		System.out.println("the number is duck or not:"+r);
	}

}


/*Write program to create class name as CheckDuck with parameterized constructor  
CheckDuck(int no): this constructor can accept number as parameter 
Boolean  isDuckNumber(): this function check if number is duck return true otherwise return false.*/
