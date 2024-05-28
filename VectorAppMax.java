
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
import java.util.*;
 class VectorAppMax {

	public static void main(String[] args) {
         Vector<Integer>v=new Vector<Integer>();
         v.add(10);
         v.add(30);
         v.add(20);
         v.add(40);
         v.add(50);
         
         int max=(int) v.get(0);
         Iterator i= v.iterator();
          
         while(i.hasNext())
         {
        	 Object obj=i.next();
        	 if((int)obj>max)
        	 {
        		 max=(int) obj;
        	 }
         }
         System.out.println("max value is :"+ max);
	}
}