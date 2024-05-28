//initialize a character variable in a program and print  alphabet  if the initialized value is an alphabet print 
//digit if the initillized value is a number,and print 'special character' if the initialized value is anything else


import java.util.*;
class alphabetical1
{
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);

if ((c>='a'&&c<='z')||(c>='A'&&c<='z'))
{
  System.out.println("alphabet");

}
else if (c>='0'&&c<='9')
{
System.out.println("digit");

}
else
{
System.out.println("special symbol");
}



}


}