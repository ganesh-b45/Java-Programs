class xyz
{
public static void main(String args[])
{
int temp=0;
int arr[]={12,34,56,54,67,86,52};
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
System.out.println("sorted arrry");
for(int i=0;i<arr.length;i++){

System.out.println(arr[i]);
}
}


}