class employee
{
int eid;
void display(String cname);
}
class manager
 {
   public static void main(String args[])
    {
//creating objects
employee e1=new employee();
employee e2=new employee();

//initializing objects
e1.eid=101;
e1.display("Ganesh");
e2.eid=102;
e2.display("Bellale");


//printing data
System.out.println(e1.eid+" "+e1.cname);
System.out.println(e2.eid+" "+e2.cname);


 }
}