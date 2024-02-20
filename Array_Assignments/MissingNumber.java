public class MissingNumber
{
   public static int MissingNum(int nums[])
   {
      int sum=0;
      for(int i=0;i<nums.length;i++)
	  {
	    sum+=nums[i];
	  }
	  int actualSum=(nums.length*(nums.length+1))/2;
	  int misssingnum=actualSum-sum;
	  return misssingnum;
   }
    public static void main(String args[])
   {
     int arr[]={3,0,1};
	 System.out.println(MissingNum(arr));
   }
   
}
