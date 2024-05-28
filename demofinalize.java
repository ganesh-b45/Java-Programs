class demofinalize
{
public static void main(String args[])
{
 new demofinalize();
demofinalize d1=new demofinalize();
demofinalize d2=new demofinalize();
demofinalize d3;
d3=d1;
d1=null;
d3=null;
System.gc();
//Runtime runtime=Runtime.getRuntime();
//runtime.gc();
}
protected void finalize()
{
System.out.println("object is destroyed");
}
}