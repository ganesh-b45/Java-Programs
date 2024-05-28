//write a program to accept gender (male or female)and age form commamd line arguments  and print
//the percentage of intrest based on the given conditions.
import java.util.*;

class genderinterest
{
public static void main(String args[])
{
String Gender= args[0];
int age=Integer.parseInt(args[1]);
if(Gender.equalsignoreCase("female")
{
if(age>=1&&age<=58)
{
System.out.println("the intrest is8.2%");
}
else if(age>=59&&age<=100)
{
System.out.println("the intrest is9.2%");
}
else
{
 System.out.println("no result:");
}
}

else if(age>=1&&age<=58)
{
System.out.println("the intrest is8.2%");

}
if(age>=59&&age<=100)
{
System.out.println("the intrest is10.5%");

}
else
{
System.out.println("data is not found");
}

}

}