import java.util.*;
class month
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int monthcode=sc.nextInt();
switch(monthcode)
{
case 12:
        System.out.println("december");
        break;

case 15:
        System.out.println("invalid month");
        break;

default:
       System.out.println("please enter the month in number");
        break;
}

}

}