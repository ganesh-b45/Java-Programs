class ganni001
{
public static void main(String args[])
{
boolean flag=false;
int arr[]={1,4,1,4};
for(int i=0;i<arr.length;i++)
{
if(arr[i]==2 || arr[i]==4)
{
System.out.println("true");
break;
}
if(!flag)
{
System.out.println("false");
}
}
}
}