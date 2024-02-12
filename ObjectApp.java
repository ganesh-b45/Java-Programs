import java.util.*;
class ObjectArrApp
{
  public static void main(String args[])
  {
    Object obj[]=new Object[5];
	obj[0]=100;
	obj[1]="ganesh";
	obj[2]=false;
	obj[3]=1.2f;
	obj[4]=new java.util.Date();
	for(int i=0;i<obj.length;i++)
	{
	  System.out.println(obj[i]);
	}
  }
}