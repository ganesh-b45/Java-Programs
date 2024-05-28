import java.util.*;
class coloralphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter the color code");

char color=sc.next().charAt(0);

switch(color)
{
case 'R':
       System.out.println("red");
       break;

case 'Y':
       System.out.println("yellow");
       break;

case 'G':
       System.out.println("green");
       break;

case 'O':
       System.out.println("orange");
       break;

case 'B':
       System.out.println("blue");
       break;

case 'W':
       System.out.println("white");
       break;



default :
       System.out.println("invalid syntax");
       break;


   }


}


}