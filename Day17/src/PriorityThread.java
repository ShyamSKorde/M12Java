  /* Thread Priority setPriority(MIN_PRIORITY),setPriority(NORM_PRIORITY),setPriority(MAX_PRIORITY),
   * setPriority()  and getPriority()*/
class PriorityDemo1 extends Thread
{
	public void run()
	{
		Thread.currentThread().setPriority(NORM_PRIORITY);//is 5
		System.out.println("Priority of Child Thread1 " +Thread.currentThread().getPriority());
	}
}
class PriorityDemo2 extends Thread
{
	public void run()
	{
		System.out.println("Priority of Child Thread2 " +Thread.currentThread().getPriority()); // is 9 because set
	}
}
class PriorityDemo3 extends Thread
{
	public void run()
	{
		System.out.println("Old Priority of Child Thread3 " +Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);// is 10
		System.out.println("Priority of Child Thread3 " +Thread.currentThread().getPriority());
	}
}
class PriorityDemo4 extends Thread
{
	public void run()
	{
		Thread.currentThread().setPriority(MIN_PRIORITY);//is 5
		System.out.println("Priority of Child Thread4 " +Thread.currentThread().getPriority());
	    
	}
}
class PriorityDemo5 extends Thread
{
	public void run()
	{
		System.out.println("Priority of Child Thread5 " +Thread.currentThread().getPriority()); // not set so provide is parent thread 6(by default is 5)
	}
}
public class PriorityThread {

	public static void main(String[] args)
	{
		System.out.println("old Priority of main Thread " +Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("Priority of main Thread " +Thread.currentThread().getPriority());
		PriorityDemo1 t1 = new PriorityDemo1();
		t1.start();
		PriorityDemo2 t2 = new PriorityDemo2();
		t2.setPriority(9);
		t2.start();
		PriorityDemo3 t3 = new PriorityDemo3();
		t3.start();
		PriorityDemo4 t4 = new PriorityDemo4();
		t4.start();
		PriorityDemo5 t5 = new PriorityDemo5();
		t5.start();		
		
		// TODO Auto-generated method stub

	}

}
/* getPriority() :- method is used to get the priority of thread by default is 5
 * setPriority() :- method is used to set the priority of thread and child not set the priority than inheritance(inherits) the priority of main thread its parent thread 
 * setPriority(MIN_PRIORITY):- is 1
 * setPriority(NORM_PRIORITY):- is 5 (By Default is 5)
 * setPriority(MAX_PRIORITY):-  is 10 
 *  those thread priority is high to execute first and those thread priority is low to execute last and some thread is same priority thread to which thread is executes its depend on JVM */

 