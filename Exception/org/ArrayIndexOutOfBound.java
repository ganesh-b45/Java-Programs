package Exception.org;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
	 int a[]=new int[2];
	 try {
		a[2]=100;
		
	} catch (Exception e) {
		System.err.println("The Exception is: "+e);
	}

	}

}

//If we think about above code we have array of size 2 means index in array 0 and
//1 and we try to store the value on a[2] which is not present in array so JVM generate the run 
//time exception to us called as ArrayIndexOutOfBoundsException so you can manage above exception
//by handling ArrayIndexOutOfBoundsException in catch block.