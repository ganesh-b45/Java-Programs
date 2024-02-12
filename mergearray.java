import java.util.*;
public class mergearray
  {
    int arr1[],arr2[];
    mergearray(int arr1[],int arr2[])
	{
	   this.arr1=arr1;
	   this.arr2=arr2;
	 }
	
	int[] getmergearray()
	{
	  int len1=arr1.length;
	  int len2=arr2.length;
	  int len3=len1+len2;
	  int merge[]=new int[len3];
	  
	  for(int i=0;i<len1;i++)
	  {
		  merge[i]=arr1[i];
	  }
	  for(int j=0;j<len2;j++)
	  {
		  merge[len1+j]=arr2[j];
	  }
	  return merge;
	 }
	 public static void main(String args[])
	 {
	   int a[]={1,2,3};
	   int a2[]={4,5,6};
	   mergearray o=new mergearray(a,a1);
	   int r[]=o.getmergearray();
	   for(int i=0;i<r.length;i++)
	   {
		   System.out.println(r[i]);
	   }
	 }
  }