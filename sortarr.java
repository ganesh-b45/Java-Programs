class sortarr
 {

	public static void main(String[] args)
 {
System.out.println("unsorted array");

   int arr[]=new int[]{23,34,31,2,1,23,45,12};
   int temp=0;
   for(int i=0;i<arr.length;i++)
{

System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;

}
}
}
System.out.println("sorted array");

for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);


}
		
	}

}