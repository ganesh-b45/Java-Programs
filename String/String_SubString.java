//Q 1. Write a C program to check whether a substring is present in a string or not. If sub string is present then display starting and ending index of substring in string 
//Ex 1.  
// Input :  Given String :    India is my country
//          Sub string:    my 
//Output:     given sub string is present between 9 and 10 index   
 
//Ex 2.  
 //Input :  Given String :  I am working in IT industry
//           Sub string:   working as
//Output:     given sub string is not present  
import java.util.*; 
class String_SubString
 {
   public static void main(String args[])
    {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String str=sc.nextLine();
	 System.out.println("Enter the substring ");
	 String sub=sc.nextLine();
	 int length=str.length();
	 
	 for(int i=0;i<length-1;i++)
	 {
		 if(str.charAt(i)==sub.charAt(i))
		 {
			continue;
		 }
		   System.out.println("last index is "+i);
		  System.out.println("Start index is "+i);
	 }
	  System.out.println(" given substring is not present");
	}
 }