import java.util.*;
class userinput
{
public static void main(String args[])
{

int num1,num2,sum,sub;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
num1=sc.nextInt();
System.out.println("enter the second number");
num2=sc.nextInt();

sum=num1+num2;
sub=num1-num2;

System.out.println("addition of two number is ="+sum);
System.out.println("sub of two number is ="+sub);
}
}