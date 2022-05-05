                      /* Join()*/
class JoinTest extends Thread 
{
	static Thread mainThread = Thread.currentThread();//wait child Thread for main thread execution so create reference to main thread its a static type  
	public void run()
	{
		try
		{
			mainThread.join();//wait child Thread for main thread execution main thread execution end than child thread start means join 
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(1000);
				System.out.println("Child Thread : " +i);
			}
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
	}
}
public class JoinDemo 
{

	public static void main(String[] args) //throws InterruptedException   
	{
		JoinTest T1 = new JoinTest();
		T1.start();
	    //T1.join();//throw Exception handle Throws keyword InterrupterException or try-catch
		try
		{
			//T1.join(); // wait main thread for child thread execution child thread execution end than main thread start means join
			for(int i=1;i<=10;i++)
			{
				//T1.join();// wait main thread for child thread execution child thread execution end than main thread start means join
				System.out.println("Main Thread : " +i);
				Thread.sleep(1000);
				
			}
		}
		catch(Exception t)
		{
			System.out.println(t);
		}
		// TODO Auto-generated method stub

	}

}
/* Join():- if a Thread wants to wait for another to complete its task than we should use join() method 
 *  
 */