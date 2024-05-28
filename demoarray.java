class demoarray
{
public static void main(String args[])
{
int akash[]=new int[]{12,13,15,14,11,11,12};

for(int i=0;i<akash.length;i++)
{
for(int j=i+1;j<akash.length;j++)
{
if(akash[i]==akash[j])

{
System.out.println(akash[j]);
}
}
}
}
}