public class ThrowandThrowsDemo
{
	void divide(int a,int b)throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			int c=a/b;
			System.out.print(c);
		}
	}
	public static void main(String []args) //throws ArithmeticException //JVM handle in case 
	{
		ThrowandThrowsDemo Tw = new ThrowandThrowsDemo();
		//Tw.divide(44,0);
		try
		{
			Tw.divide(44,0);
		}
		catch(Exception e)
		{
			System.out.println("the valu of b is zero so not divide by zero "+e);
			//e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
