class demomax
{
public static void main(String args[])
{
int numbers[]=new int[5];
for(int i=0;i<numbers.length;i++)
{
numbers[i]=Integer.parseInt(args[i]);
}
int max=numbers[0];
for(int i=0;i<numbers.length;i++)
{
if(max<numbers[i])
{
max=numbers[i];

  }
 
}
System.out.println("max number is="+max);
}
}