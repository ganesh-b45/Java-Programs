package giris_techub_org.com;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicIconFactory;

class circle{
	int r;
	float pi=3.14f;
	void setradius(int radius)
	{
		r=radius;
	}
	void showarea()
	{
		float area = (float) (Math.PI * Math.pow(r, 2));
		System.out.println("the area of circle is:"+area);
	}
	
}
public class Circle_area {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		int radius=sc.nextInt();
		circle c=new circle();
		c.setradius(radius);
		c.showarea();

	}

}
