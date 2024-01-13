/**
 * VarArg       ... indicate that this method can take the infinite parameter
 */
import java.util.*;
class vararg_imple
{
    int s=0;
   void calsum(int ...x)
   {
     for(int i=0;i<x.length;i++)
     {
        s+=x[i];
     }
     System.out.println("sum of all value is"+s);
   }
   
}
public class VarArg {

    public static void main(String[] args) {
        vararg_imple v=new vararg_imple();
        v.calsum(2,20,30,4,50);
        
    }
}