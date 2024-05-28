class DemoDivide
{
public static void main(String args[])
{
int n1;
int n2;
int div=0;

try
{
n1=Integer.parseInt(args[0]);
n2=Integer.parseInt(args[1]);


div=n1/n2;
}
catch(ArithmeticException ex)
{
System.out.println("cant divide by zero");

}

System.out.println("Divison is="+div);

}
}