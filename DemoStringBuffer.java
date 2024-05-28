class DemoStringBuffer{
public static void main(String args[])
{
int no=Integer.parseInt(args []no);
String s=String.valueof(no);
StringBuffer sb1=new StringBuffer(s);
sb1.reverse();
if(s.equals(sb1.toString()))
{
System.out.println("palindrome");
}
else
System.out.println("not palindrome");
}
}