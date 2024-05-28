class Singleinheritance {
	void bark()
	{
		System.out.println("Barking");
	}
}
	class abc extends Singleinheritance
	{
		void eat()
		{
			System.out.println("Eating");
	}
	}
	class Test
	{
	
		public static void main(String args[])
		{
			abc e=new abc();
			e.eat();
			e.bark();
		}

}
