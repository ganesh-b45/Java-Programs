import java.util.*;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorSearchApplication {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		int limit;
		Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter limit");
		limit=xyz.nextInt();
		for(int i=0;i<limit;i++) {
			System.out.println("Enter data in vector");
			int data=xyz.nextInt();
			v.add(data);
		}
		
		System.out.println("Enter data for search");
		int skey=xyz.nextInt();
		boolean b=v.contains(skey);
		if(b) 
		{
			System.out.println("Data Found");
		}
		else {
			System.out.println("Data not found");
		}
		
	}
}
