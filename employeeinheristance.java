class employee
{
float salary=40000;
}
class programmer extends employee{
float bonus=3002.1f;
public static void main(String args[])
{
programmer ganesh=new programmer();
System.out.println("programmer salary is="+ganesh.salary);
System.out.println("programmer bonus is="+ganesh.bonus);
}
}