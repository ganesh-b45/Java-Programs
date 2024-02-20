//Write program to create class name as FindMax with two functions 
//void setArray(int a[]): this function is used for accept array as parameter 
//int getMax(): this function can find the max value from array and return it. 


package practice;

public class findmax 
{
	int x[];
	void setarray(int[] x2)
	{
		this.x=x2;
	}
    int getmax()
    {
    	int max=x[0];
    	for(int i=1;i<x.length;i++)
    	{
    		if(x[i]>max)
    		{
    			max=x[i];
    		}
    	}
    	return max;
    }
	public static void main(String[] args) 
	{
		int x[]= {3,4,6,9,3,74,6,78};
		findmax f=new findmax();
		f.setarray(x);
		int r=f.getmax();
		System.out.println("The max element is :"+r);

	}

}
