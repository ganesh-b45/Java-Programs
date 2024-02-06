abstract class Inter56
{

   int a[];
   int b[];
    void set(int a[], int b[])
{

    this.a=a;
    this.b=b;

}

abstract int [] getres();



}

class inter23 extends Inter56
{

   public int [] getres()
{
    
    int resultant[]=new int[5];
    for(int i=0;i<a.length;i++)
{
    for(int j=0;j<b.length;j++)
   {

      if(a[i]==b[j])
{

     resultant[i]=a[i];
}

}

}
    return resultant;
}

    

}




class intersection22
{


public static void main(String args[])
{




   int a[]=new int[] {1,2,3,4,5};
   int b[]=new int[] {1,2,3,6,7};
   inter23 im=new inter23();
   im.set(a,b);
   int res[]=im.getres();
   for(int i=0;i<res.length;i++)
   {
      if(res[i]!=0)
          System.out.println(res[i]);

   }




    }



}