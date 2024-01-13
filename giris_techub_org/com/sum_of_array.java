package giris_techub_org.com;
import java.util.*;
public class sum_of_array {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array you want to create");
		int n=sc.nextInt();
		//int index=0;
		int array[]=new int[n];
		System.out.println("enter the elements you want to add");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("the sum of array is"+sum);

	}

}
