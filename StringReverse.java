class StringReverse
 {
  public static void main(String args[])
   {
     String s="Java is best programming language";
	 char ch[]=s.toCharArray();
	 int length=ch.length;
	 
	 for(int i=0;i<ch.length/2;i++)
	 {
		 char temp=ch[i];
		 ch[i]=ch[length-i-1];
		 ch[length-i-1]=temp;
	 }
	 String s1=new String(ch);
	System.out.println("Reversed String: " + s1);
   }
 }