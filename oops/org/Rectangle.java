//1) Create a class named 'Rectangle' with two data members- length and breadth  and a method to calculate the area which is 'length*breadth'.  
//The class has three constructors which are :  
//1	- having no parameter - values of both length and breadth are assigned zero. 
//2	- having two numbers as parameters  
 // - the two numbers are assigned as length and breadth respectively. 3 - having one number as parameter - both length and breadth are assigned that number. 
 //Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas

class Rectangle 
{
  int length,breadth;
  Rectangle()
  {
  length=0;
  breadth=0;
  }
  
  Rectangle (int length,int breadth)
  {
    this.length=length;
    this.breadth=breadth;	
  }
  
  Rectangle(int number)
  {
   length=number;
   breadth=number;
  }
  void display()
  {
     int area=length*breadth;
     System.out.println("The area will be :"+area);	 
  }
    public static void main(String[] args)
	{
	  Rectangle obj=new Rectangle();
	   obj.display(); 
	  Rectangle obj2=new Rectangle(10,20);
	  obj2.display();
	  Rectangle obj3=new Rectangle(20);
	  obj3.display();
	  
	 
	 
	
	}
}