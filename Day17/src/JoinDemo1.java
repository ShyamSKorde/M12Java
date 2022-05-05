          /* join()*/
public class JoinDemo1 extends Thread 
{  
	 static Thread t;//get the reference to current thread means main thread 
	public void run()
	{
		try
		{ 
			t.join();//execute main thread and wait T1 thread
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(1000);
				System.out.println("Child Thread : " +i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)throws InterruptedException
	{
		t= Thread.currentThread();//provide the reference to the current thread means main thread
		JoinDemo1 T1 = new JoinDemo1();
		T1.start();
		//T1.join();//execute T1 thread and wait main thread and write to use throws keyword
		for(int i=1;i<=10;i++)
		{
			//T1.join(); //in the try catch block not used throws keyword
			Thread.sleep(1000);
			System.out.println("Main Thread : " +i);
		}
	}
}

