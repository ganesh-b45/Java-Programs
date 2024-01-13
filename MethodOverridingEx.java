// Java Program to implement
// Method Overriding
import java.io.*;

// Base Class
class Animal {
	void eat()
	{
		System.out.println("eat() method of base class");
		System.out.println("eating.");
	}
}

// Inherited Class
class Dog extends Animal {
	void eat()
	{
		System.out.println("eat() method of derived class");
		System.out.println("Dog is eating.");
	}
}

class MethodOverridingEx {
	// Main Function
	public static void main(String args[])
	{
		Dog d1 = new Dog();
		Animal a1 = new Animal();

		
		a1.eat();
		d1.eat();

		//Animal animal = new Dog();
		// eat() method of animal class is overridden by
		// base class eat()
		//animal.eat();
	}
}
