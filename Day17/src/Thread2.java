            /* Performing Single Task for Multiple Thread */
class Test2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		    System.out.println("Performing Single Task for Multiple Thread " +i);
		}
	}
}
public class Thread2 {

	public static void main(String[] args) 
	{
		Test2 T1 = new Test2();
		T1.start();
		Test2 T2 = new Test2(); // create 2 thread T1,T2 and execute at same time 
		T2.start();
		//T1.start(); one thread is start only one time try to many time than throws exception IllegalThreadStateException
        // but its possible to create 2 thread and perform one single task at same time 		// TODO Auto-generated method stub

	}

}
// in multithreading not get proper put which thread is execute first its depend on JVM 