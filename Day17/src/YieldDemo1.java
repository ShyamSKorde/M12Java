     /* yield(); */
class YielTest1 extends Thread
{
	public void run()
	{
		Thread.yield();//if you want Thread 1 method stop and provide chance to other threads for execution
		System.out.println("child thread 1 : " +Thread.currentThread().getName());
	}
}
class YielTest2 extends Thread
{
	public void run()
	{
		System.out.println("child thread 2 : " +Thread.currentThread().getName());	
	}
}
class YielTest3 extends Thread
{
	public void run()
	{
		System.out.println("child thread 3 : " +Thread.currentThread().getName());
	}
}
public class YieldDemo1
{
	public static void main(String[] args)
	{
		//System.out.println("Main Thread : " +Thread.currentThread().getName());
		//Thread`.yield(); if you want main method stop and provide chance to other threads for execution 
		YielTest1 T1 = new YielTest1();
		T1.start();   
		YielTest2 T2 = new YielTest2();
		T2.start();
		YielTest3 T3 = new YielTest3();
		T3.start();
		System.out.println("Main Thread : " +Thread.currentThread().getName());
		// TODO Auto-generated method stub

	}

}
/*
 * IMP point using Yield() Method :-
 * Normal Thread or same priority which thread executes first depend on Thread Scheduler
 * Thread provide the hint to thread scheduler than it is depend on thread scheduler accept or ignore the hint (multiple thread :- which thread execute depend on thread scheduler)
 * accept hint :- current thread stop and execute another thread 
 * Ignore hint :- the current thread execute Output may different
 * Windows properly support to yield() than output is proper, otherwise output not constant and not proper (Thread scheduler is ignore hint,/Not windows support);*/
