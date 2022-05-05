
class UnderAgeException1 extends RuntimeException // create Unchecked exception or Run Time exception its by user than extends RunException class because it's parent class of Unchecked exception we can used Exception but its checked Exception category  
{
	UnderAgeException1()//constructor no-parameterized constructor 
	{
		super("you are not eligible for voting becouse your age is below 18"); // super is used to pass the massage of parent class Default exception handler 
	}
	UnderAgeException1(String Message)//constructor parameterized constructor print user write message 
	{
		super(Message);
	}//constructor overloading and different parameter 
	
	
}
public class CreateUncheckedExceotionRT 
{

	public static void main(String[] args)  
	{
		int Age = 17;
		/*if (Age<18)
		{
			throw new UnderAgeException("you are voting successfully...."); //compile program but not handle exception because Unchecked exception so handle exception try-catch block 
		}*/

		try
		{
		if (Age<18)
		{
			throw new UnderAgeException1(); //compile program but not handle exception because Unchecked exception so handle exception try-catch block 
		}
		else 
		{
			System.out.println("you are eligible for voting and you can Vot now.....");
		}
		}
		catch(UnderAgeException1 e)
		{
			e.printStackTrace();
		}
		System.out.println("you are voting successfully....");
	}
	


}
//create bye user customize Exception or Unchecked or Run time exception

