import java.util.*;
class TestNestedClass{  
 private int data=30;  
 //inner class can access all the fields of outer class even private
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  TestNestedClass obj=new TestNestedClass();  
  TestNestedClass.Inner in=obj.new Inner();  
  in.msg();  
 }  
}  