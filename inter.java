interface inner
{
abstract void print();
}

class inter implements inner
{
public void print()
{
System.out.println("Cocsit");
}

public static void main(String s[])
{
inter mp=new inter();
mp.print();
}
}