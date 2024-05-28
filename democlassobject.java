class democlassobject
{
int id;
static String name;

}
class demo1
{
public static void main(String args[])
{
democlassobject d1=new democlassobject();
democlassobject d2=new democlassobject();
d1.id=101;
d1.name="ganesh";
d2.id=102;
d2.name="bellaleganesh";
System.out.println(d1.id+ " "+d1.name);
System.out.println(d2.id+ " "+d2.name);


}
}