public class Demo//try-catch/throws program
{
	public static void Wait()throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String []args)//throws InterruptedException, ArithmeticException //Exception 
	{
		
		try
		{
            Wait();
		    System.out.print(10/0);
		   
		}
		catch(Exception e)
		{
			System.out.println("Exception handle"+e);
		}
	    System.out.println("Main Method Ended");
	}

}
