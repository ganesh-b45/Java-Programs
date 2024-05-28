class abc
 {
   void perfrom(int a,int b) throws ArithmeticException
    {
	   int z=a/b;
	   System.out.println("the result is "+z);
    }
  }
 class main
 {
  public static void main(String args[])
   {
      try
	  {
	   abc a=new abc();
	   a.perfrom(10,0);
	  }
	  catch(Exception e)
	  {
	   System.out.println("Exception occrure "+e);
	  }
    }
  }