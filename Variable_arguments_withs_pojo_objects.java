
class Emp_var_arg
{
	private int id;
	private int sal;
	private String address;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Employee_object_class
{
	private Emp_var_arg emp[];
	
    void setDetails(Emp_var_arg ...emp) {
		this.emp = emp;
	}
    
    void display()
    {
      for(int i=0;i<emp.length;i++)
      {
    	  System.out.println(emp[i].getId()+"\t"+emp[i].getSal()+"\t"+emp[i].getAddress()+"\t"+emp[i].getName());
      }
    }
}
public class Variable_arguments_withs_pojo_objects {

	public static void main(String[] args) {
		Emp_var_arg e=new Emp_var_arg();
		Employee_object_class eo=new Employee_object_class();
		e.setId(1);
		e.setAddress("pune");
		e.setName("Ganesh");
		e.setSal(10000);
		
		Emp_var_arg e1=new Emp_var_arg();
		e1.setId(2);
		e1.setAddress("Mumbai");
		e1.setName("Sonu");
		e1.setSal(200000);
		eo.setDetails(e,e1);
		eo.display();
	}

}
