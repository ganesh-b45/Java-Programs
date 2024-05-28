class DemoStringBuffer001{
public static void main(String args[])
{
StringBuffer sb1=new StringBuffer("abefg");
sb1.insert(2,"cd");
sb1.setCharAt(5,'x');
sb1.delete(3,6);
sb1.append("xyz");
StringBuffer sb2=new StringBuffer();
String s=sb2.toString();
System.out.println(s);
}
}