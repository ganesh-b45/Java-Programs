class area
  {
	int rectarea;
	double cirarea;
	float Sqrarea;
	void calarea(int width,int length)
	{
		rectarea=width*length;
		System.out.println("Rectangle Area="+rectarea);
	}
	void calarea(double redius)	
	{
		cirarea=3.14*redius*redius;
		System.out.println("Circle Area="+cirarea);
	}
	void calarea(float side)
	{
		Sqrarea=side*side;
		System.out.println("Square Area="+Sqrarea);
	}
}
class demoOverloding003
   {
	public static void main(String args[])
	{
		area area=new area();
		area.calarea(6,6);
		area.calarea(6f);
		area.calarea(4);
	}
}