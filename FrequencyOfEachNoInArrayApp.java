
import java.util.*;

class majorityElement {
	int arr[];
   majorityElement(int arr[]){
		this.arr=arr;
		System.out.println("Shown array: ");
		for(int i=0;i<arr.length;i++){
			System.out.printf("%4d\t",arr[i]);
		}
	}
	
	 void majorityElement_perform(){
		
		int flag=0;
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=(i+1);j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr[j]=-1;
					count++;
				}
			}
			if(arr[i]!=-1&&count>arr.length/2){
				flag=arr[i];
			}		
		}
		if(flag!=0){
		System.out.println("\n\nMajority Element found: "+flag);
		}
		else{
		System.out.println("\n\nMajority Element not found");
		}
		
	}
	
}
public class FrequencyOfEachNoInArrayApp{
	public static void main(String x[]){

		Scanner k=new Scanner(System.in);
		/*	
		System.out.println("Enter values in array: ");
		
		int arr[]=new int[11];
		for(int i=0;i<arr.length;i++){

			arr[i]=k.nextInt();
		}
		
		*/

		majorityElement mt=new majorityElement(new int[]{1,1,1,5,1,7,1,2,1,4});
		
		mt.majorityElement_perform();
		
	}


}