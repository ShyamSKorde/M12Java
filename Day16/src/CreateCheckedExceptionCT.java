class UnderAgeException extends Exception // create check exception or Compile Time exception its by user than extends exception class because it's parent class of checked exception we can used RunTimeException but its Unchecked Exception category  
{
	UnderAgeException()//constructor no-parameterized constructor 
	{
		super("you are not eligible for voting becouse your age is below 18"); // super is used to pass the msg of parent class Default exception handler 
	}
	UnderAgeException(String Message)//constructor parameterized constructor print user write message 
	{
		super(Message);
	}//constructor overloading and different parameter 
	
	
}
public class CreateCheckedExceptionCT 
{
	public static void main(String[] args) //throws UnderAgeException we can used try it
	{
		int age = 19;
		//int age = 19;

		/*if(age<18)
		{
			throw new UnderAgeException("you are not eligible for voting"); // not compile so we can used try- catch block otherwise throws  keyword 
		}*/
		try
		{
		if(age<18)
		{
			throw new UnderAgeException("you are not eligible for voting"); // not compile so we can used try- catch block otherwise throws  keyword 
		}
		else
		{
			System.out.println(" you are eligible for voting and you can Vot now.....");
		}
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("you are voting successfully....");
		// TODO Auto-generated method stub

	}

}
//create bye user customize Exception or checked or compile time exception 