import java.util.*;
class posnegzero
{
  public static void main(String args[])
{
  int num;
Scanner sc=new Scanner(System.in);

System.out.println("enter any integer number");
num=sc.nextInt();
if(num>0)
{
  System.out.println(num+"is positive number");
}
else if(num<0)
{
  System.out.println(num+"is negative number");
}
else
{
System.out.println(num+"its zero");
}

}



}