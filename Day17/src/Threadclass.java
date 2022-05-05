            /* By extending Thread Class */

class MyThread1 extends Thread //thread is class name so used extends and available in java.lang package 
{
	public void run() // run method is override method and define thread class line 4-10 work is 5 time print the name run method is available in thread class  
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Shyam " +i);
			
		}
	}
}
public class Threadclass 
{
	public static void main(String[] args)//  main is thread 
	{
		MyThread1 t1 = new MyThread1();
		//t1.run();// direct call but not a thread its normal method  
		t1.start();//start the thread and call internally run method 
		//T1.start(); one thread is start only one time try to many time than throws exception IllegalThreadStateException but its possible to create 2 thread and perform one single task at same time
		for(int i=1;i<=3;i++)// main method is thread and work is 5 time print the name
		{
			System.out.println("Ram " +i);
			
		}
	}

}
 //note:- in miltithreading not show proper output always miss-match 
/* Steps :- By extending Thread Class
 * 1) extending thread class 
 * 2) override run method 
 * 3) creating object of class(User extends or create class)
 * 4) invoke the thread start() 
 * */ 
 