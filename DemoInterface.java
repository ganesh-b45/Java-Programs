interface Bank
{
int balance=1000;
void calInterestRate();
default void display()
{
System.out.println("this is the default method");
}
static void printBalance(int amt)
{

System.out.println("balance is"+(balance+amt));

}
}
class SBI implements Bank
{
 public void calInterestRate()
{
System.out.println("interest rate is"+4+"%");
}
}
class DemoInterface
{
public static void main(String args[])
{
Bank bank;
bank=new SBI();
bank.calInterestRate();
bank.display();
Bank.printBalance(5000);
}
}