class AutoboxingAndUnboxing
 {
  public static void main(String args[])
	{
	 	  System.out.println("Primitive To Wrapper:");
	  char c='a';
	  Character cw=c;
	     System.out.println("Char to Wrapper:"+c);
	  short s=57;
	  Short sw=s;
	      System.out.println("short to Wrapper:"+sw);
	  long l=1231;
	  Long lw=l;
	  	  System.out.println("long to Wrapper:"+lw);
	  double d=34113;
      Double dw=d;
	  	  System.out.println("double to Wrapper:"+dw);
	  boolean b=true;
	  Boolean boolvalue=b;
	  	  System.out.println("booleanto Wrapper:"+boolvalue);
	  byte bvalue=5;
	  Byte bwbyte=bvalue;
	  	  System.out.println("byte to Wrapper:"+bwbyte);
	  int i=10;
	  Integer iw=i;
	  	  System.out.println("int to Wrapper:"+iw);
	  float f=3.1f;
	  Float fw=f;
	  	  System.out.println("flaot to Wrapper:"+fw);
	  
	   System.out.println("Wrapper To Primitive:");
	   char cp=cw;
	    System.out.println("char To Primitive:"+cp);
	   short sp=sw;
	    System.out.println("short To Primitive:"+sp);
	   long lp=lw;
	    System.out.println("long To Primitive:"+lp);
	   double dp=dw;
	    System.out.println("double To Primitive:"+dp);
	   boolean boolvaluea=boolvalue;
	    System.out.println(" boolean To Primitive:"+boolvaluea);
	   byte bp=bwbyte;
	    System.out.println("byte To Primitive:"+bp);
	   int ip=iw;
	    System.out.println("int To Primitive:"+ip);
	   float fp=fw;
	    System.out.println(" flaot Wrapper To Primitive:"+fp);
    }
 }