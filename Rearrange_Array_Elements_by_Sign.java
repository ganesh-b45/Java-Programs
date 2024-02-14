class Rearrange_Array_Elements_by_Sign 
{
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int PosInd=0,NegInd=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                ans[PosInd]=nums[i];
                PosInd +=2;
            }
            else
            {
                ans[NegInd]=nums[i];
                NegInd +=2;
            }
        }
        return ans;
    }
	
   public static void main(String args[])
   {
     Rearrange_Array_Elements_by_Sign obj= new Rearrange_Array_Elements_by_Sign();
	 int  arr[] = new int[]{3,1,-2,-5,2,-4};
	
	 int ans[]= obj.rearrangeArray(arr);
	 
	 for(int i=0;i<ans.length;i++)
	 {
	   System.out.print( "\t" + ans[i]);
	 }
   }
}