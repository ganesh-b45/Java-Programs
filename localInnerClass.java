public class localInnerClass
 { 
   private int data=30;//instance variable 
   
   void display()
   {  
     class Local  //local class 
      {  
        void msg()
		{
			System.out.println(data);
		}  
      }  
        Local l=new Local();  
        l.msg();  
   }  
 public static void main(String args[]){  
  localInnerClass obj=new localInnerClass();  
  obj.display();  
 }  
}  
