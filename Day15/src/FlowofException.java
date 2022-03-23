
public class FlowofException 
{

	public static void main(String[] args) 
	{
		System.out.println("how to run the exception program := Flow of program");
		System.out.println("1");
		try
		{
		  System.out.println("2");
		  int a = 100;
		  int b = 2, c;   // try 
		  System.out.println("3");
			 c = a/b;
		  System.out.println("4");
		  System.out.print(c);
		  System.out.println("5");
		}
		catch(Exception e)//ArithmeticException
		{
		  System.out.println("6");
		  System.out.println(e);
		  System.out.println("7");
		}
		System.out.println("Hello");
		// TODO Auto-generated method stub

	}

}
