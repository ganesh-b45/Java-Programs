import java.util.*;
public class frequencyEachDigit{
	
	public static void main(String []args){
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number: ");
		int no=sc.nextInt();
		int rem;
		int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
		while(no>0){
			
			rem=no%10;
			
			switch(rem){
				case 0:
				zero++;
				break;
				case 1:
				one++;
				break;
				case 2:
				two++;
				break;
				case 3:
				three++;
				break;
				case 4:
				four++;
				break;
				case 5:
				five++;
				break;
				case 6:
				six++;
				break;
				case 7:
				seven++;
				break;
				case 8:
				eight++;
				break;
				case 9:
				nine++;
				break;
				
			}
			
			no/=10;
		}
		
		System.out.println(" '0' Occurs in: "+zero);
		System.out.println(" '1' Occurs in: "+one);	
		System.out.println(" '2' Occurs in: "+two);
		System.out.println(" '3' Occurs in: "+three);
		System.out.println(" '4' Occurs in: "+four);
		System.out.println(" '5' Occurs in: "+five);
		System.out.println(" '6' Occurs in: "+six);
		System.out.println(" '7' Occurs in: "+seven);
		System.out.println(" '8' Occurs in: "+eight);
		System.out.println(" '9' Occurs in: "+nine);
	}
}