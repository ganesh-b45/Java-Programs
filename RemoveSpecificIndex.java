import java.util.*;
public class RemoveSpecificIndex {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,index,size=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter index value ");
		index=sc.nextInt();
		int count=0;
		for(i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			
		}
		for(i=0;i<a.length-1;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}

}
