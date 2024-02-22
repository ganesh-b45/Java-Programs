import java.util.*;
public class VectorSearchApplication {
	public static void main(String[] args) {
		Vector v =new Vector();
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
		int index=v.indexOf(skey);
		if(index!=-1) {System.out.println("Data found");
		}
		else {
			System.out.println("Data not found");
		}
	}
}
