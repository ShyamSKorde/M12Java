                /* Suspend() resume() stop() */
class SuspendTest extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
class ResumeTest extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
class StopTest extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class DeprecatMethodDemo 
{
	
	@SuppressWarnings({ "removal", "deprecation" })
	public static void main(String[] args)
	{
		SuspendTest T1 = new SuspendTest();
		ResumeTest T2 = new ResumeTest();
		StopTest T3 = new StopTest();
		T1.setName("Thread T1"); 
		T2.setName("Thread T2"); 
		T3.setName("Thread T3");
		T1.start();
		T2.start();
		T2.suspend();//put T2 thread waiting state -remove  
		T3.start();
	    T2.resume();//T1 thread waiting state to running state -remove 
	    T1.stop();//T1 thread permanently stop/terminate- deprecation0
	 }

}  
/* suspend():- put the thread from running state to waiting state 
 * resume() :- resume a suspend thread from waiting state to running/runnable state 
 * stop()   :- terminated a thread permanently 
 *  3 thread method has been deprecated since version 1.2 and marked for removal */
