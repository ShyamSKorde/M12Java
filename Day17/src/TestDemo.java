               /* getName() &  setName() & isAlive() */
public class TestDemo extends Thread
{
	public void run()
	{
		//System.out.println("Thread Task is executed by :- " +Thread.currentThread().getName());
		System.out.println("Thread Task is executed by :- " +Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
		//System.out.println("Hello is printed by :-  " +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive()); // Main thread is always running state so is True 
		Thread.currentThread().setName("Gajanan");
		System.out.println("Hello is printed by :-  " +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		
		
		TestDemo T1 = new TestDemo();
		System.out.println("fghj " +T1.isAlive());// T1 thread is not running state so return false 
		T1.setName("Shyam");
		T1.start();
		System.out.println("fr " +T1.isAlive());//T1 Thread is Running State so return true
		
		TestDemo T2 = new TestDemo();
		T2.setName("Ram");
		T2.start();
		// TODO Auto-generated method stub
    }

}
/* isAlive():- its is used to check if a thread is alive or not alive refers to a thread has begun but not been terminated
 * (running state - true or terminate/ready - false)
 * true :- return true if the thread is alive which is any time after the thread has been start  
 * false :- return false if the thread is not alive is any time before the thread has been start */