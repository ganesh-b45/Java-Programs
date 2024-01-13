package String;

import java.util.Scanner;

public class Count_vowels_consonant_space_word {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
//		char[] ch=s.toCharArray();
		int vowelsc=0;
		int consonantc=0;
		int spacec=0;
		int word=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch.isLetter(ch))
			{
				if("aeiouAEIOU".indexOf(ch)!=-1)
				{
					vowelsc++;
				}
				else
				{
					consonantc++;
				}
			}
			else if(ch.isWhitespace(ch))
			{
				spacec++;
			}
		}
		String words[]=s.split(s);
		word =words.length;
		
		System.out.println("vowels:"+vowelsc);
		System.out.println("consonant:"+consonantc);
		System.out.println("word:"+word);
		System.out.println("space:"+spacec);
	}

}
