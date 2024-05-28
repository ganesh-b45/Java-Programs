class Employee{
	private int id;
	private String name;
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
	private int sal;
	private String address;
	
}
class Company{
	 private Employee emp[];
	void setDetails(Employee ...emp) {
	   this.emp=emp;
	}
	void showDetails() {
		for(int i=0;i<emp.length;i++) {
		  System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSal()+"\t"+emp[i].getAddress());
		}
	}
}
public class CompanyApp
{
    public static void main(String[] args)
    {
    	Company c = new Company();
    	Employee e = new Employee();
    	 e.setId(1);
    	 e.setName("ABC");
    	 e.setSal(10000);
    	 e.setAddress("PUNE");
    	 
    	 Employee e1 = new Employee();
    	 e1.setId(2);
    	 e1.setName("MNO");
    	 e1.setSal(20000);
    	 e1.setAddress("NASHIK");
    	 
    	 Employee e2 = new Employee();
    	 e2.setId(2);
    	 e2.setName("PQR");
    	 e2.setSal(30000);
    	 e2.setAddress("DELHI");
    	 c.setDetails(e,e1,e2);
    	 c.showDetails();
	}
}
