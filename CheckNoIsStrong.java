import java.util.*;
class CheckNoIsStrong
 {
	  public static void main(String[] args)
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Nnumer ");
	      int no=sc.nextInt();
		  int rem,fact,sum=0;
		  int originalNo=no;
		  int temp=no;
		  while(temp!=0)
		  {
		     rem=temp%10;
			fact=1;
			for(int i=1;i<=rem;i++)
			{
			  fact=fact*i;
			}
			sum=sum+fact;
		    temp=temp/10;
		  }
		  System.out.println("The sum is :"+sum);
		  if(sum==originalNo)
		  {
		    System.out.println("No is strong");
		  }
		  else
		  {
		      System.out.println("No is not strong");
		  }
   }
   
 }