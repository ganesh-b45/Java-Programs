package practice;

public class pojo 
{
	private int id;
	private String name;
	private int salaty;

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

	public int getSalaty() {
		return salaty;
	}

	public void setSalaty(int salaty) {
		this.salaty = salaty;
	}
    
	public static void main(String[] args) 
	{
		pojo p=new pojo();
		p.setId(1);
		p.setName("ganesh");
		p.setSalaty(10000);
		int i=p.getId();
		String n=p.getName();
		int s=p.getSalaty();
		System.out.println("id:"+ i +" name:"+ n +" salary :"+s);
	}

}
