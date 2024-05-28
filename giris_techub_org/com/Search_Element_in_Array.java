package giris_techub_org.com;
import java.util.*;
public class Search_Element_in_Array {

	public static void main(String[] args) {
		int flag=0, a[]=new int[]{1,2,3,4,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key u want too seaarch");
		int key=sc.nextInt();
		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				flag=1;
			}
		}
			if(flag==1)
			{
				System.out.println("Element found");
			}
			else
			{
				System.out.println("Element not found");
			}
	}

}
