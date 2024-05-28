package Pojo;

class Employee
{
	private int id;
	private String name;
	private int sal;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
class companny
{
	private Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	void showdetails()
	{
		System.out.println(emp.getId()+"\t "+emp.getName()+"\t"+emp.getAddress()+"\t"+emp.getSal());
	}
}

public class Pojo_Companny_App {

	public static void main(String[] args) {
		Employee e=new Employee();
		companny c=new companny();
		e.setId(1);
		e.setName("ganesh");
		e.setAddress("RokdaSawaragaon");
		e.setSal(150000);
		c.setEmp(e);
		c.showdetails();
		
		
//		Employee e1=new Employee();
//		e1.setId(101);
//		e1.setName("ganeshb");
//		e1.setAddress("latur");
//		e1.setSal(150000);
//		c.setEmp(e1);
//		c.showdetails();
	}

}
