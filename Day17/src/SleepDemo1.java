
class SleepTest1 extends Thread 
{
	public void run() // throws InterruptedException Exception InterruptedException is not compatible with throws clause in Thread.run()
	{                 
		try
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" :- "+i);
				Thread.sleep(1000);
			}

		}
		catch(InterruptedException e)
		{
			e.printStackTrace(); 
		}
	}
}
public class SleepDemo1
{

	public static void main(String[] args)throws InterruptedException
	{
		SleepTest1 T1 = new SleepTest1();
		T1.start();
		for (int i=1;i<=5;i++)
		{
			//System.out.print(Name+ " " +i);
			System.out.println(Thread.currentThread().getName()+" :- "+i);
			Thread.sleep(2000);
																																														
	
        }
    }
		
		// TODO Auto-generated method stub

}
/* sleep():- this method is throw InterruptedException handle it using throws keyword otherwise try-catch block 
 *           this method is used in child thread(public void run()) to throw InterruptedException handle it try-catch block not throws keyword because this method is override method  */
