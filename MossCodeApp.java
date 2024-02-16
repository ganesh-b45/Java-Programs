import java.util.*;
interface StringOperation
{
	void performOperation();
}
class stringToBinary implements StringOperation
{
	String str;
	void setString(String str) //set the input string 
	{
		this.str=str;
	}
	
	public void performOperation()
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String binary=Integer.toBinaryString(ch);
			System.out.println(binary+" ");
		}
		System.out.println();
	}
}

class StringToMorseCode implements StringOperation
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	public void performOperation()
	{

		String[] morseCode = {
	            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", // A-I
	            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", // J-R
	            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." // S-Z
	        };
		
		for(int i=0;i<str.length();i++)
		{
				char ch=Character.toLowerCase(str.charAt(i));
				if(ch>='a' && ch<='z' )
				{
					int index=ch - 'a';
					System.out.println(morseCode[index]+" ");
				}
		}
		System.out.println();
	}
	
}
public class MossCodeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter String:");
		String str="program";
		
		stringToBinary stb=new stringToBinary();
		StringToMorseCode stm = new StringToMorseCode();
		stb.setString(str);
		stm.setString(str);
		
		System.out.println("String to Binary:");
		stb.performOperation();
		System.out.println("String to morse code:");
		stm.performOperation();
		
	}

}