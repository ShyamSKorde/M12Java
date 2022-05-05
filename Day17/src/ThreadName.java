     /* getName() and  setName() Method */
class Threadname1 extends Thread
{
	public void run()
	{
		System.out.println("Old Thread name for user thread is :- " +Thread.currentThread().getName());
		Thread.currentThread().setName("shyam");
		System.out.println(Thread.currentThread().getName());
		String Name = Thread.currentThread().getName(); // getName() method is used to get the name of current Thread and default name is Thread-0 to Thread-10
		System.out.println("New Thread name for user thread is :- " +Name);// Shyam is thread name 
	}
}
public class ThreadName 
{
	public static void main(String[]args)

	{    
		System.out.println("Old Thread name for main thread is :- " +Thread.currentThread().getName()); // Main thread name // currentThread() is a static method so direct call by class name is thread 
		System.out.println("Hello");//Simple hello print 
		System.out.println(Thread.currentThread().getName());// main Thread name 
		Thread.currentThread().setName("Ram");// set name for main thread (Change the name for main Thread )
		System.out.println("New Thread name for main thread is :- " +Thread.currentThread().getName());// get name for main thread is Ram
		Threadname1 t1 = new Threadname1();
		//t1.setName("shyam"); // SetName() method is used to sat the name for user created thread 
	    t1.start();
	    
	}
	

}
