package giris_techub_org.com;

import java.util.Scanner;
class Employee
{
	int id,basicsal,newsal;
	String name;
	void setPersonalInfo(int id,int basicsal,String name)
	{
		this.basicsal=basicsal;
		this.id=id;
		this.name=name;
	}
	void setProgressPer(int progress)
	{
		if(progress>=60)
		{
			 newsal=basicsal*30;
		}
	}
	void show()
	{
		System.out.println("Deatails of Employee:"+id +" "+name+ " "+basicsal+" "+newsal);
	}
}
public class Employee_class {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setPersonalInfo(1, 10000,"ganesh");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the per ");
		int per=sc.nextInt();
		e.setProgressPer(per);
		e.show();
  
	}

}
