          /* yield() */
class YielTest extends Thread
{
	public void run()
	{
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			//Thread.yield();
			System.out.println("child thread");
		}
		
	}
}
public class YieldDemo 
{
	public static void main(String[]args)
	{
		YielTest t1 = new YielTest();
		t1.start();
		for(int i=1;i<=5;i++)
		{
			//Thread.yield();
			System.out.println("Main thread");
		}
	}


}
/* yield():- this method is a Thread class method which is stop the current execution Thread and give a chance to another Thread for execution
 *           Thread provide the hint to thread scheduler than it is depend on thread scheduler accept or ignore the hint (multiple thread :- which thread execute depend on thread scheduler 
 *           accept current thread stop, and ignore the current thread execute Output may different  */
 