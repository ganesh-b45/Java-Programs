//3)	Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. 
//Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50.  
//Now make two constructors of this class as follows:  
//1	- without any parameter - no amount will be added to the Piggie Bank  
//2	- having a parameter which is the amount that will be added to Piggie Bank  
//Create object of the 'AddAmount' class and display the final amount in Piggie Bank


class AddAmount
{
  int amount=50;
  AddAmount()
  {
    System.out.println("The Initial balance in bank:"+amount);
  }
  
  AddAmount(int new_amount)
  {
   int result=amount+new_amount;
   System.out.println("The Bank Balance after deposite:"+result);
  }
  
  public static void main(String args[])
  {
   AddAmount ob1=new AddAmount();
  AddAmount obj=new AddAmount(100);
 
  }
}