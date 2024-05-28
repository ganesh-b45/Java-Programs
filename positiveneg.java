import java.util.*;
class positiveneg
{

public static void main(String []args)
{
int num;
Scanner sc=new Scanner(System.in);

System.out.println("enter any number");
num=sc.nextInt();
if(num>0)
{
System.out.println(num+"is positive");
}
else if(num<0)
{

System.out.println(num+"is negative");
} 
 else
{
System.out.println(num+"is zero");
}
  }
}



