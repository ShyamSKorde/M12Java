//throw keyword used for user define and customize uncheck exception object not handle exception
import java.util.Scanner;
class YoungerAgeException extends RuntimeException //only exception write than check exception 
                                                   //only RuntimeException write than Uncheck/customize exception
{
	YoungerAgeException(String msg)//constructor //msg available on default exception handler //non-parameterize constructor 
	{
		super(msg); //msg available on default exception handler super is used msg in available on parent class defaultexception handler than used super(msg);
		
	}
}
public class Throwtest // class create Throwtest
{
	public static void main(String[] args)  
	{
		Scanner Sc = new Scanner(System.in);//scanner class in used for get user input 
		System.out.println("enter your age ");
		int age = Sc.nextInt();
		Sc.close();
		try 
		{
			if(age<18) 
			{
			  throw new YoungerAgeException("You are not eleigable for Voting");//below 18 than throw line 1-17 and abnormally terminate
			  //System.out.println("hiiiiii"); //after throw any write than not print only ignore it provide unreachable statement error

			}
			else
			{
				System.out.println("You are eligible for Voting Successfully......");//above 18 than throw this line 18...etc
			}
		}
		catch(YoungerAgeException e)//YoungerAgeException class name provide possible // catch block used maninually create object handle and print details  
		{
			e.printStackTrace();//The method printStackTrace(PrintStream) in the type Throwable is not applicable for the arguments (Exception)
		}
		System.out.println("Hello");
		/*if(age<18) 
		{
		  throw new YoungerAgeException("You are not eleigable for Voting");//below 18 than throw line 1-17 and abnormally terminate 	
		}
		else
		{
			System.out.println("You are eligible for Voting");//above 18 than throw this line 18...etc
		}
		System.out.print("Hello");*/
		// TODO Auto-generated method stub
	}
}
// in this case programmer create exception object maninually and pass JVM Than main method 
//Yes:- run, No:-JVM provid object pass to default exception handler than print proper Exception
