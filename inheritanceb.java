class inheritancea
{
int id=121;
String name="ganesh";
}
class inheritanceb extends inheritancea
{
float fees=12000;
public static void main(String args[])
{
inheritanceb college=new inheritanceb();
System.out.println("student id no is="+ college.id);
System.out.println("student name is="+ college.name);
System.out.println("student college fees is="+ college.fees);

}
}