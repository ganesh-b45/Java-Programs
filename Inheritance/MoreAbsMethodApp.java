package Inheritance;
abstract class A
{  abstract void show();
   abstract void display();
}
class ADP extends A{
    void show(){
    }
   void display(){
   }
}
class B extends ADP
{   void show(){
     System.out.println("I required only show method in class B");
    }
     
}
class C extends ADP
{   void display(){
     System.out.println("I required only display method in class C");
   }
    
}
public class MoreAbsMethodApp
{ public static void main(String x[])
   {    B b1 = new B();
	    b1.show();
	    C c1 = new C();
	    c1.display();
   }
}