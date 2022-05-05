                /* sleep() Method */
class SleepTest extends Thread 
{
	public void run()
	{
		try
		{
			//String Name = Thread.currentThread().getName();
			for (int i=1;i<=5;i++)
			{
				//System.out.print(Name+ " " +i);
				System.out.println(Thread.currentThread().getName()+" :- "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)//InterruptedException
		{
		        System.out.println(e);	
		}
		
	}
}
public class SleepDemo
{
	public static void main(String[] args) 
	{
		SleepTest T1 = new SleepTest();
		SleepTest T2 = new SleepTest();
		SleepTest T3 = new SleepTest();
		T1.setName("Thread T1"); 
		T2.setName("Thread T2"); 
		T3.setName("Thread T3"); 
		T1.start();
		T3.start();
		T2.start();
		// TODO Auto-generated method stub

	}

}
/* sleep() :- is a Static Method and throw InterruptedException
 *            put the Thread in to Temporary waiting state */
