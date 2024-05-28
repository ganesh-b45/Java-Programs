package Exception.org;
class voterexeception extends ArithmeticException
{
	public String getErrorMsg()
	{
		return "Invalid Voter";
	}
}
class VotingMachine
{
	void VerifyAge(int age)
	{
		if(age<18)
		{
			voterexeception ve=new voterexeception();
			throw ve;
		}
		else
		{
			System.out.println("Valid Voter");
		}
	}
}
public class Userr_definde_exception {

	public static void main(String[] args) 
	{
		try {
			VotingMachine obj=new VotingMachine();
			obj.VerifyAge(777);
					
		
			
		} catch (Exception ve) 
		{
			System.out.println(((voterexeception) ve).getErrorMsg());
		}

	}

}
