class DemoThrow
{
   static void divide(int n1,int n2)
   {
     if(n2==0)
     {
         throw new ArithmeticException("cant divide by zero");
     }
     else
     {
      System.out.println("division is="+(n1/n2));
     }
   }
    public static void main(String args[])
    {
      try
        {
          divide(12,0);
    }
      catch(ArithmeticException ex)
    {
     System.out.println("can't divide");
    } 
 }
}