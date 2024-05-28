class Memo
{
int a;
int b;

void Memo(int aa,int bb)
{
a=aa;
b=bb;
}
void ak()
{
System.out.println(a+b);
}
public static void main(String s[])
{
Memo ac=new Memo(23,42);
ac.ak();
}
}
