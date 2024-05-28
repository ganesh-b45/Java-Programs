class fruit {
	String taste;
	String fruitname;
	void eat(String taste,String fruitname)
	{
		this.taste=taste;
		this.fruitname=fruitname;
		System.out.println("the name of fruit and teste is nothing");
	}
}
class apple extends fruit
{
	String fruitname;
	void eat(String fruitname)
	{
		this.fruitname=fruitname;
		System.out.println("the name of fruit and teste is nothing");
		
	}

}
class orange extends fruit
{
	String fruitname;
	void eat(String fruitname)
	{
		this.fruitname=fruitname;
		System.out.println("the name of fruit and teste is nothing");
	}

}
class main{
	public static void main(String args[])
	{
		fruit f=new fruit();
		f.eat("teste", "fruitname");
		apple a=new apple();
		a.eat("fruitname");
		orange o=new orange();
		o.eat("fruitname");
	}
}