//5)Write a program to do the following. 
//Create a superclass called Vehicle with properties color, model, year. Create a subclass called Car that inherits from 
//Vehicle and  adds a new property called numDoors and a method displayInfo to display all  the values assigned to the properties. 
//Create an object of the Car class and call the displayInfo method. 

class vehicle 
 {
   String color="black";
   String model="XUV700";
   int year=2028;   
 }
class car extends vehicle
{
  int numDoors=4;
  void displayInfo()
  {
    System.out.println("The color of car is :"+color);
	System.out.println("The model of car is :"+model);
	System.out.println("The year of car is :"+year);
	System.out.println("The number of doors is :"+numDoors);
  }
}
class vehicle_car
{
  static public void main(String args[])
  {
    car obj=new car();
	obj.displayInfo();
  }
}