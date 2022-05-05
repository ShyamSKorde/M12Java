           /* Daemon Thread isDaemon() & setDaemon(boolean b) Method
            *  */ 

public class DaemonThread extends Thread
{
	public void run()
	{
		/*System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread");
		}
		else
		{
			System.out.println("child Thread");
		}*/
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Daemon Thread");
	}

	public static void main(String[] args) 
	{
		//System.out.println("main thread");
		DaemonThread T1 = new DaemonThread();
		T1.setDaemon(false);// false because not convert to Daemon thread 
		T1.start();
		DaemonThread T2 = new DaemonThread();
		T2.setDaemon(true); // true because covert to Daemon thread 
		T2.start();
		// T2.setDaemon(true);// note used than used to throws exception IllegalThreadStateException
		// TODO Auto-generated method stub

	}

}
/* 
 * isDaemon() :- Check the Current thread or Thread is Daemon or Not  "Tests if this thread is a daemon thread or Not Daemon Thread"
                 Returns: true if this thread is a daemon thread. 
                 Returns: false if this thread is not a daemon thread. its run on the background and provide the services to another thread 
 * setDaemon(boolean b) :- method is used to convert the thread is daemon thread  
 * setDaemon(true) :- thread convert the Daemon thread 
 * setDaemon(false) :- thread is not convert the Daemon thread 
 */
