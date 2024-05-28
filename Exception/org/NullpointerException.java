
package Exception.org;

public class NullpointerException {
	   staic int a[];
	   public static void main(String x[])
	    { 
	     try {
				a[0]=100;
			} 
	      catch(NullPointerException ex)
	      { 
	    	  System.out.println("Error is  "+ex);
	      }
	    }
 }
