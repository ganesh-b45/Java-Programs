package String;

public class Reverse_str {

	public static void main(String[] args) {
		String s="good morning india and MH";
		char c[]=s.toCharArray();
		int length=c.length;
		for(int i=0;i<length/2;i++)
		{
			char temp=c[i];
			c[i]=c[length-i-1];
			c[length-i-1]=temp;
			
		}
		String Reverse=new String(c);
		System.out.println("Original String:"+s);
		System.out.println("After Reverse String:"+Reverse);
	}

}
