import java.util.*;
interface ArrayOperation
{
  void PerformOperation(int a[]);
}
class Sort implements ArrayOperation
{
  public void PerformOperation(int a[])
 {
 for(int i=0;i<a.length;i++)
 {
  for(int j=i+1;j<a.length;j++)
    {
     if(a[i]>a[j])
       {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp; 
       }
    }
  }
   System.out.println("sorted successfuly");
}
}
class Insertion implements ArrayOperation
{
   public void PerformOperation(int a[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the index where you want to insert element");
	int index=sc.nextInt();
	for(int i=a.length-2;i>=index;i--)
	   {
		  a[i+1]=a[i];  
	   }
	   System.out.println("enter the element");
	   int element=sc.nextInt();
	   a[index]=element;
	   
	   System.out.println("after insertion of element");
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
	   }
	   
  }
}
class Interface_ArrayOperation
{
   public static void main(String args[])
   { 
      int arr[]=new int[]{10,20,30,40,50};
      Sort obj=new Sort();
	  obj.PerformOperation(arr);
	  Insertion obj2=new Insertion();
	  obj2.PerformOperation(arr);
   }
}