class singleinheritance {
	int id;
	String name;
	

}
 class bellale extends singleinheritance
 {
	 String classname;
     void add()
{
  System.out.println("This is a id"+id);		
			System.out.println("This is a classname"+classname);
			System.out.println("This is a name"+name);
	
	 }
		 
		  public static void main(String[] args) {
			 bellale a=new bellale();
           a.id=101;
           a.classname="BCS";
           a.name="Ganesh";
           a.add();
			 }
 }
