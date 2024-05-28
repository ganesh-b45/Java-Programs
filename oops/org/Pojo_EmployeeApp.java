//6)create program to create class POJO class name as Employee with id,name,designation and salary with a setter and getter 
//methods,insert 5 records  and we want to create one more class name as Company with parameterized constructor
//Company(Employee employee)here we pass Employee class reference as parameter in Company class constructor and method name 
//as sortEmployee() to sort employees in descending order by salary we have one more method name as void show() 
//using this method we can get employee details and display it. 

class Employee{
	private int id;
	private String name;
	private String dis;
	private int salary;
	
	Employee(int id,String name,String dis,int salary){
		this.id=id;
		this.name=name;
		this.dis=dis;
		this.salary=salary;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDis(){
		return dis;
	}
	public int getSalary(){
		return salary;
	}
	//public String toString(Employee e1){
	//	return "["+e1.getId+"\t"+e1.getName+"\t"+e1.getDis+"\t"+e.getSalary+"]";
	//}

}
class company
{
		Employee e[];
		company(Employee e[]){
			this.e=e;
		}
		public void sortEmployee()
		{
			int i,j;
			Employee e1=null;
			for(i=0;i<e.length;i++)
			{
			  for(j=i+1;j<e.length;j++)
			  {			
                if(e[i].getSalary()<e[j].getSalary())
				{
                    e1=e[i];
				    e[i]=e[j];
				    e[j]=e1;
								
					}
				}

			}
			for( i=0;i<e.length;i++)
			 {
			//System.out.println(e[i].toString(e[i]));
			 System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSalary()+"\t"+e[i].getDis());
		     }
		}
}
public class Pojo_EmployeeApp{
	public static void main(String x[]){
		Employee e[]=new Employee[5];
		e[0]=new Employee(1,"Ganesh","Manager",50000);
		e[1]=new Employee(2,"Akash","developer",40000);
		e[2]=new Employee(3,"Sonu","Programmer",20000);
		e[3]=new Employee(4,"Vishal","support",45000);
		e[4]=new Employee(5,"Yogesh","hamal",34000);
		
		System.out.println("Before Sorting the informtion");
		for(int i=0;i<e.length;i++){
			//System.out.println(e[i].toString(e[i]));
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSalary());
		}
		
		System.out.println("After Sorting ");
		company c=new company(e);
		c.sortEmployee();
	}
		
}