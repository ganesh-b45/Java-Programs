
interface playable
{
	void play();

}
class veena implements playable
{
	public void play()
	{
		System.out.println("this is the veena class");
	}
}
class saxophone implements playable
{
	public void play()
	{
		System.out.println("this the sexophone class");
	}
}

class testinterface
{
	public static void main(String args[])
	{
		veena v=new veena();
				v.play();
		saxophone s=new saxophone();
		        s.play();
		
	}
}