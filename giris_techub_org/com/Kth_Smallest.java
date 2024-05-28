package giris_techub_org.com;
class small
{
	void sort(int x[])
	{
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.println("sortrd array is"+x[i]);
		}
	}
}
public class Kth_Smallest {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,7,5,34};
		small s=new small();
		s.sort(a);

	}

}
