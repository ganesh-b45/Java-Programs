package giris_techub_org.com;
import java.util.*;
public class Max_and_Min_Array {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5};
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The max no is"+max);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				max=a[i];
			}
		}
		System.out.println("The min no is"+min);


	}

}
