//import java.io.fileInputStream;
public class TestException 
{

	public static void main(String[] args)
	{
		try
		{
		//fileInputStream fis = new FilterInputStream("d:/abc.txt"); //Compile time exception 
		
		//Class.forName("com.mysql.jdbc.Driver"); //Compile time exception 
		int a = 100, b = 0 , c;
		c = a/b;
		System.out.println(c); // Run time exception 
		}
		//String Name = null;
		//System.out.println(Name.length());//Run time exception 
		//catch(Exception e)
		catch (ArithmeticException e)
		{
			System.out.println("you can not devide by zero");
		}
		System.out.println("Exception handle");
		//int a = 100, b = 4 , c;
		//c = a/b;
		//System.out.println(c);
		
		// TODO Auto-generated method stub

	}

}
