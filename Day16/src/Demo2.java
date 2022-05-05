class InvalidAgeException extends Exception 
{

	InvalidAgeException(String msg)
	{
		super(msg);
	}
}
public class Demo2 //throw vs throws & try-catch Program user create object and Exception Handle
{
	public static void main(String[] args) 
	{
		try
		{
			vote(13);
		}
		catch(InvalidAgeException e)//exception
		{
			e.printStackTrace();
		}
		System.out.println("...........");
	}
	public static void vote(int Age)throws InvalidAgeException //throws-used check and Uncheck and declare the exception   
	{
		Age = 19; //15;
		if(Age<18)
		{
			throw new InvalidAgeException("You are not eligible for voting");
		}
		else
		{
			System.out.println("You are eligible for voting"+"\n"+"you Vote Sucessfully..... ");
		}
		// TODO Auto-generated method stub

	}

}
