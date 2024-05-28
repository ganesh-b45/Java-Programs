package String;

import java.util.Scanner;

public class SearchStringDataApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		String s=sc.nextLine();
		String words[]=s.split(" ");
		int count=0;
		for(String word:words)
		{
			if(word.endsWith("ing"))
			{
		       ++count;
			}
		}
		System.out.printf("umber of words end with ing %d\n",count);
	}

}
