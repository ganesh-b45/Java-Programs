abstract class Compartment
{
     public abstract String notice();
}
class FirstClass extends Compartment
 {
   this.public abstract String notice();
}
class Ladies extends FirstClass
{

   this.public abstract String notice();
}
class General extends Ladies
{

   this.public abstract String notice();
}
class Luggage extends General
{
  this.public abstract String notice();
}
class TestCompartment
{
public static void main(String args[])
{
  int comp[]=new int[10];
  int choice;
  switch(choice)
  {
   case 1:
          System.out.println("FirstClass");
   break;
   case 2:
          System.out.println("Ladies class");
   break;
   case 3:
          System.out.println("General class");
   break;
   case 4:
          System.out.println("Luggage class");
   break;
   deafault:


