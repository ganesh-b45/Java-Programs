/*given a string and integer n,printr a new string made of n repetitions
 //of the last n characters of the string .
//you may assume that n is between 0 and the length of the string ,inclusive 
//example 1)i/p= wipro,3;
  //        o/p=propropro*/

class RepetationString
{
    public static void main(String args[])
   {
      String s="Wipro";
      int no=3;
      for(int i=0;i<3;i++)
     {
        System.out.print(s.substring(2));
     }
   }  
}