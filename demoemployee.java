public class demoemployee
{
public static void main(String args[])
{
employee emp1=new employee();
emp1.setid(101);
emp1.setname("ganesh");
emp1.setsalary(25000);
emp1.getempdetails();

employee emp2=new employee();
emp2.setid(102);
emp2.setname("bellale");
emp2.setsalary(5000);
emp2.getempdetails();

new employee().getempdetails();//ananomus object

employee emp3=new employee(500,"bellale ganesh",2000);//parameterized constructer
emp3.getemployeedetails();
}

}