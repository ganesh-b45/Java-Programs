//4)Write a program to create a class called "Animal" that has some basic methods  
//and variables like "eat" and "sleep".  You want to create a new class called "Dog" that 
//has all the methods and  variables of "Animal", but also has its own methods and  variables 
//like "bark" and "breed". Instead of creating a completely new class from scratch, you can 
//use inheritance to create a subclass of "Animal" called "Dog". In this example, "Dog" is a subclass of "Animal".  
//It inherits all the methods and variables of "Animal" (i.e. "eat" and "sleep"),  and also has its own methods and 
//variables (i.e. "bark" and "breed"). 
 
 class Animal
 {
    void eat()
    {
     System.out.println(" parent class method eat...");
    }
   void sleep()
	{
	  System.out.println(" parent class method sleep...");
	}
 }
 class dog extends Animal
 {
  void bark()
   {
    System.out.println(" chaild class method eat...");
   }
    
	void breed()
   {
    System.out.println(" chaild class method breed...");
   }
 }
 class Animal_Dog
  {
    public static void main(String args[])
	 {
	   dog obj=new dog();
	   obj.eat();
	   obj.sleep();
	   obj.bark();
	   obj.breed();
	 }
	
   }