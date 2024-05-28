class Akash
{
int id;
String name;

 Akash(int id, String name)
{
this.id=id;
this.name=name;
}
void bk()
{
System.out.println(id+" "+name);
}

public static void main(String s[])

{
Akash s1=new Akash(10,"Akash");
Akash s2=new Akash(11,"Suraj");

s1.bk();
s2.bk();
}

}