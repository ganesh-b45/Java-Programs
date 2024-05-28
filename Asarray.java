class Asarray
{

   public static void main(String args[])
   {
     
      int arr[]={5,4,3,2,1};
      int temp;
      for(int i=0-;i<arr.length;i++)
      { 
          for(int j=i+1;j<arr.length;j++)
          {
              temp=arr[j];
              arr[j]=arr[i];
              arr[i]=temp;
          }

            System.out.println(arr[i]);
       }
}
 }
              

