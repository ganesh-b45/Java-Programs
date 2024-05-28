import java.util.*;
class checkprime
{
public static void main(String args[])
{
System.out.println("enter the number");

Scanner sc=new Scanner (System.in);
int num=sc.nextInt();
if(num%2==1 && num%2==3)
{
System.out.println("this is prime number");
}
else
{
System.out.println("this is not prime number");

}

}

}