
import java.util.Scanner;
import java.util.*;
 class Array_Floor {
	static int floor(int a[] ,int target)
	{

		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid= start +(end - start)/  2;
			if(target<a[mid])
			{
			  end=mid-1;	
			}
			else if (target>a[mid]) 
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		int[] arr= {1,3,6,7,8,11,13,16};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target element");
		int target=sc.nextInt()	;
		int ans=floor(arr, target);
		System.out.println("The celling element index is:"+ans);

	}

}