
//WAP to create class name as FindElement with one constructor and method 
//FindElement(int a[]): this constructor is used for accept array as parameter 
//boolean searchElement(): this method help us to search element in array if found return true otherwise returnfalse. 
package Constructor;
import java.util.*;
import java.util.Scanner;
class Elements
{
	
	int a[];
	Elements(int a[]) {
		this.a=a;
	}
	boolean Search_Elements(int key)
	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
}
	
public class Find_Element
 {
	
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		System.out.println("Enter the element in the array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Elements f=new Elements(a);
		System.out.println("Enter the key");
		int key=sc.nextInt();
		boolean result=f.Search_Elements(key);
		if(result)
		{
			System.out.println("Elements found");
		}
		else
		{
			System.out.println("Element not found");
		}
  }
	
}
