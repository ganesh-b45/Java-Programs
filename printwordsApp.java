// 5. Write a  program to enter a number and print it in words.
import java.util.*;

public class printwordsApp{
	
	public static void main(String []args){
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number: ");
		int no=sc.nextInt();
		int rem,rem1;
		int rev=0;
		while(no>0){
			rem=no%10;
			rev=rev*10+rem;
			no/=10;
		}
		
		while(rev>0){
			
			rem1=rev%10;
			
			switch(rem1){
				case 0:
				System.out.println("Zero");
				break;
				case 1:
				System.out.println("one");
				break;
				case 2:
				System.out.println("two");
				break;
				case 3:
				System.out.println("three");
				break;
				case 4:
				System.out.println("four");
				break;
				case 5:
				System.out.println("five");
				break;
				case 6:
				System.out.println("six");
				break;
				case 7:
				System.out.println("seven");
				break;
				case 8:
				System.out.println("eight");
				break;
				case 9:
				System.out.println("nine");
				break;
				
			}
			
			rev/=10;
		}
		
	}
}