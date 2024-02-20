package practice;

public class checkchar 
{
	char ch;
	void setchar(char ch)
	{
		this.ch=ch;
	}
    boolean checkchar()
    {
//    	if((ch>='a' || ch<='z')&&(ch>='A'|| ch<='Z'))
//    	{
//    		return true;
//    	}
//    	else
//    	{
//    		return false;
//    	}
    	if (Character.isLetterOrDigit(ch)) 
    	{
            if (Character.isDigit(ch)) 
            {
                return false;
            } 
            else 
            {
                return true;
            }
        } 
    	else 
    	{
            return false;
        }
    }	
    
	public static void main(String[] args) 
	{
		checkchar c=new checkchar();
		c.setchar('1');
		boolean r=c.checkchar();
		System.out.println("is charater or digit :"+r);
	}

}
