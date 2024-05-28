class power
{
   public static void main(String args[])
    { 
       int index,base,p=1;
       index=Integer.parseInt(args[0]);
       base=Integer.parseInt(args[1]);
       for(int i=1;i<=index;i++)
          {
            p=p*base;
          }
          System.out.printf("the power is %d\n",p);
     }
}
