class a
{
int salary=1222;
float advance=1231;
}

class b extends a{
int bonus=1000;
public static void main(String args[])
{
b ganesh=new b();
System.out.println("salary is ="+ganesh.salary);
System.out.println("bonus is="+ganesh.bonus);
System.out.println("advance is ="+ganesh.advance);
}
}