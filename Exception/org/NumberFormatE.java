package Exception.org;
import java.util.*;
public class NumberFormatE {
	static int a[];
	   public static void main(String x[])
	    { 
	      try{
	          String s="12345 ";
		      int a = Integer.parseInt(s);
		      System.out.printf("A is %d\n",a);
	      }
	      catch(NumberFormatException ex)
	      { 
	    	  System.out.println("Error is  "+ex);
	      }
	    }
}
