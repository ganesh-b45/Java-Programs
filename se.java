//initialize two character variables ina program and display the character in alphabetical order.


//example :1:if the first character is's'and second character is'e' then the ouput should be e,s.
   
import java.util.*;
class se

{
public static void main(String args [])
{
 Scanner sc=new Scanner(System.in);
char c1=sc.next().charAt(0);
char c2=sc.next().charAt(0);

if(c1>c2)
{
System.out.println(c2+" "+c1);
}
else
{
System.out.println(c1+" "+c2);

}

}

}