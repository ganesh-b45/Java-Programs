class demoarray002
{
public static void main(String args[])
{
int arr[]=new int[]{12,12,11,14,14,11,16};

for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[j]);
  }

}
}
}

}