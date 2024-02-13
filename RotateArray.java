import java.util.*;
public class RotateArray{
	public static void main(String args[]){
		Scanner k=new Scanner (System.in);

				int arr[]={3,4,5,2,1};
	int index=3;
	int len=4;
	int i=1;
		while(i<=index)
		{
				int temp = arr[0];
				for(int j=0;j<5-1;j++)
				{
					arr[j]=arr[j+1];	
				}
				arr[4]=temp;
				i++;
		}
		System.out.printf("After RotateArray");
		for(int j=0;j<5;j++){
			System.out.printf("%d ",arr[j]);
		}
	}
	
}