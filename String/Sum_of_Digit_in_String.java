package String;

import java.util.Scanner;

public class Sum_of_Digit_in_String {

	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
        	if(ch[i]>='0'&& ch[i]<='9')
        	{
        		sum+=ch[i]-48;
        	}
        }
        System.out.println("THE sum of digit from string is:"+sum);

	}

}
