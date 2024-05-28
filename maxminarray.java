class maxminarray
{
public static void main(String args[])
{
int arr[]={10,20,30,40};
int min=arr[0];
int max=0;

for(int i=0;i<arr.length;i++)
{

if(arr[i]<min)
{
min=arr[i];
}
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("the minimum number is="+min);
System.out.println("the minimum number is="+max);


}
}