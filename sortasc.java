class sortasc
{
public static void main(String args[])
{
int arr[]=new int[]{3,4,1,145,34,52345,22,35,76,876,23,45,23,24,14,16,34};
int temp=0;

//sort the array in ascending order
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
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
}

}

}