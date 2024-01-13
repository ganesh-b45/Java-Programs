package String;

import java.util.Scanner;

public class Alphabet_Diit_Specialsymbol 
{
	public static void main(String[] args) {
		int alphac=0;
		int digitc=0;
		int spc=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.nextLine();
	    char c[]=s.toCharArray();
	    for(int i=0;i<c.length;i++)
	    {
	    	if((c[i]>='a' && c[i]<='z')||(c[i]>='A' &&c[i]<='Z'))
	    	{
	    		alphac++;
	    	}
	    	else if(c[i]>=0 || c[i]<=9)
	    	{
	    		digitc++;
	    	}
	    	else
	    	{
	    		spc++;
	    	}
	    }
	    System.out.println("alphabet :"+alphac);
	    System.out.println("digit:"+digitc);
	    System.out.println("spc:"+spc);
		  
		
	}

}
