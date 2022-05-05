         /*  interrupt() & interrupted() &  isInterrupted()  */
class InterruptTest extends Thread 
{
	public void run()
	{
		System.out.println(" A1" +Thread.interrupted());//true --> false if thread is interrupted  return boolean value is true than change the status false and thread is execute normally output constant  
		//System.out.println(" A2" +Thread.interrupted());                                           // if thread is not interrupted return boolean value is false not change 
		System.out.println("B1" +Thread.currentThread().isInterrupted()); 
		//System.out.println("B2" +Thread.currentThread().isInterrupted());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());//is used than return always false because change the thread status true-->false 
			}
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		      System.out.println("Thread is Interrupted ");
		}
	}
}
public class InterrruptDemo
{
	public static void main(String[]args)
	{
		InterruptTest T1 = new InterruptTest();
		T1.start();
		T1.interrupt();
		// TODO Auto-generated method stub
		
	}

}
/* 1) interrupt():- it is used to interrupt an executing thread.
 *              method will always works when the thread is in sleeping or waiting state(Sleep() or wait()).
 *              if a thread is not sleep or waiting state than calling interrupt() method will perform normal behavior.
 *              interrupt() method throw an exception InterruptedExpection.  
 *              T1.interrupt() is used than go to run method and execute for loop and print 1 than T1 Thread is sleep() method and interrupted thread T1 go catch block print by user write anyone. 
 * 2) interrupted():- method is used to check whether thread is interrupted or not. 
 *               method clear the status from true to false if thread is interrupted.
 *               interrupted() method is static method than call using class name its Thread.interrupted().
 *               interrupted() method will change the status (result) if called twice(2 times call the same method)
 * 3) isInterrupted():- method is used to check whether thread is interrupted or not.
 *                method does not clear the status from true to false if thread is interrupted.    
 *                interrupted() method will does not change the status (result) if called twice(2 times call the same method)*/
                  