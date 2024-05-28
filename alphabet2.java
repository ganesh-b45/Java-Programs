import java.util.*;
class alphabet2
{
 public static void main(String []args)
{
Scanner sc=new Scanner(System.in);

char c=sc.next().charAt(0);

if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{
 System.out.println("alphabet");
}
 else if(c>='0'&&c<='9')
{
 System.out.println("digits");
}
else
{
 System.out.println("special symbols");
}
}
}