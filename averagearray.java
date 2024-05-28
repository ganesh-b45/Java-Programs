class averagearray
{
public static void main(String args[])
{
int arr[]=new int[]{10,20,30,40};
int sum=0;
 for(int i=0;i<arr.length;i++)
{

sum=sum + arr[i];

}
System.out.println("the sum of array is="+sum);
double average=(sum/arr.length);
System.out.println("the average of array is="+average);

}

}