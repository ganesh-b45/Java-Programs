class studentb
{
public static void main(String args[])
{
studenta ganni=new studenta();
ganni.setId(Integer.parseInt(args[0]));
ganni.setName(args[1]);
System.out.println("id="+ ganni.getId());
System.out.println("String="+ ganni.getName());
}
}
