public class Normal1 
{
	public static void main(String[] args)
	{
		try
		{
		int a= 100, b = 0, c; 
		c = a/b;
		System.out.println(c);
	
		// TODO Auto-generated method stub
		}
		catch(ArithmeticException e) //(Exception e)
		{
			System.out.println(e);//java.lang.ArithmeticException: / by zero,(e)print class name and Description (Massage) only, not Stackstrace
			//e.printStackTrace(); print location only not class name and  
		}
		System.out.println("Hello");
	}

}
