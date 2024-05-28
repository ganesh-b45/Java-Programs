class animal
{
void print()
{
System.out.println("bellale");
}
}
class dog extends animal
{
void print1()
{
System.out.println("dog");
}
}
class cat extends dog
{
void print2()
{
System.out.println("cat");
}
}
class animalclass
{
public static void main(String args[])
{
cat a=new cat();
a.print();
a.print1();
a.print2();
}
}