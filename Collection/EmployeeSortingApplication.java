import java.util.*;
class Employee implements Comparable {
	private int id;
	private String name;
	public Employee() {
		
	}
	public Employee(String name,int id,int sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
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
	private int sal;
	@Override
	public int compareTo(Object o) {
		 Employee e=(Employee)o;
		 if(this.id>e.id) {
			 return 1;
		 }
		 else if(this.id<e.id) {
			 return -1;
		 }
		 else {
		    return 0;
		 }
	}
}

public class EmployeeSortingApplication {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Employee emp1 = new Employee("ABC",1,10000); 
		Employee emp2 = new Employee("MNO",3,20000);
		Employee emp3 = new Employee("PQR",2,5000);
		Employee emp4 = new Employee("STV",4,9000);
		Employee emp5 = new Employee("XYZ",5,7000);
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		System.out.println("Before Sorting");
		for(Object obj:al) {
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		Collections.sort(al);
		System.out.println("After Sorting");
		for(Object obj:al) {
			Employee e=(Employee)obj;
			System.out.println (e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
	}
}
