import java.util.*;
class PrimeSum
{
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the no ");
	 int no=sc.nextInt();
	 int count;
	 int sum=0;
	 
	 for( int i=1;i<=no;i++)
	 {
		 int temp=i;
		 count=0;
	  for(int j=1;j<=temp;j++)
	  {
	   if(temp%j==0)
	   {
	     count++;
	   }
	 }
      if(count==2)
	  {
		  System.out.println(i);
	    sum=sum+i;
	  }
    } 
     System.out.println("The sum of 1 to n number is:"+sum);
  }
}