             /* Get default name for getName() method and 
              * Set name for the setName() method  */
class ThreadName101 extends Thread
{
	public void run()
	{
		System.out.println(" Default name of thread is 101 :- " +Thread.currentThread().getName());
		Thread.currentThread().setName( " Thread 1 ");
		System.out.println(" Set Name of the Thread is 101 :- " +Thread.currentThread().getName());
	}
}
class ThreadName12 extends Thread
{
	public void run()
	{
		System.out.println(" Default name of thread is 12 :- " +Thread.currentThread().getName());
		Thread.currentThread().setName( " Thread 2 ");
		System.out.println(" Set Name of the Thread is 12 :- " +Thread.currentThread().getName());
	}
}
class ThreadName13 extends Thread
{
	public void run()
	{
		System.out.println(" Default name of thread is 13 :- " +Thread.currentThread().getName());
		Thread.currentThread().setName( " Thread 3 ");
		System.out.println(" Set Name of the Thread is 13 :- " +Thread.currentThread().getName());
	}
}
class ThreadName14 extends Thread
{
	public void run()
	{
		//System.out.println(" Default name of thread is 4 :- " +Thread.currentThread().getName());
		String Name = Thread.currentThread().getName();
		System.out.println(" Set Name of the Thread is 14 :- " +Name);
	}
}
public class ThreadName11 
{
	public static void main(String[] args)
	{
		ThreadName101 T1 =new ThreadName101();
		T1.start();
		ThreadName12 T2 =new ThreadName12();
		T2.start();
		ThreadName13 T3 =new ThreadName13();
		T3.start();
		ThreadName14 T4 =new ThreadName14();
		T4.setName("Thread 4");
		T4.start();
		
		//System.out.println(Thread.currentThread().getName());//main
		System.out.println("This block is main Thread ");// simple masg print 
		Thread.currentThread().setName("PUBJI");//set name for main thread is PUBJI
		System.out.println(Thread.currentThread().getName());//PUBJI 
		//System.out.println(10/0);//Exception in thread "PUBJI" java.lang.ArithmeticException: / by zero
		                         //at ThreadName11.main(ThreadName11.java:10)	
	}

}
