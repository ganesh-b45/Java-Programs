import java.io.*;

class succeedingorder 
{
	
	static void ganni(int arr[], int x, int y) 
{

	int sum = 0;
	boolean add = true;
		
	for (int i=0; i<arr.length; i++) 
{

	if (arr[i] != x && add == true)

	sum = sum + arr[i];
			
	else if (arr[i] == x)
	add = false;

   else if (arr[i] == y)
	add = true;

	}

	System.out.println(sum);

	}

	public static void main(String[] args) 
{

	int arr[] = {10,3,6,1,2,7,9};
	int x = 6;
	int y = 7;
	ganni(arr,x,y);

   }

}