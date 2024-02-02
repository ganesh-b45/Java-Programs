package Array_Assignments;
import java.util.Scanner;
public class Searching {

		public static int binarysearch(int a[],int key)
		{
			int l=0,h=a.length-1,mid=0;
			while(l<=h)	
			{
				mid=(l+h)/2;
				if(key==a[mid])
				{
					return mid;
				}
				else if(key<a[mid])
				{
					h=mid-1;
					l=l;
				}
				else
				{
					l=mid+1; 
					h=h;
				}
			}
		return -1;	
		}
		
		public static void main(String[] args) {
			int a[]= {2,3,4,5,6,7,8};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the key which you want to search from the array");
			int key=sc.nextInt();
//			Searching obj=new Searching();
//	        obj.binarysearch(a, key);
			System.out.println(binarysearch(a,key));
	        
		}

	}



