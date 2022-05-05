package com.java.Multhreading;
class Eclipse extends Thread
{
	public void run()
	{
		
		System.out.println("Eclips Thread Name : "+Thread.currentThread().getName()+" & "+" Eclipse id : "+Thread.currentThread().getId());
	}
}
class MSEdge extends Thread
{
	public void run()
	{
		System.out.println("MSEdge Thread Name : "+Thread.currentThread().getName()+" & "+"Msedge id "+Thread.currentThread().getId());
	}
	
}
class OutLook extends Thread
{
	public void run()
	{
		System.out.println("OutLook Thread Name : "+Thread.currentThread().getName()+" & "+"Outlook id "+Thread.currentThread().getId());
	}
	
}
public class ThreadDemo1 {
	public static void main(String[] args)
	{
		
    Eclipse ob=new Eclipse ();
    ob.start();
    MSEdge ob1=new MSEdge();
    ob1.start();
    OutLook ob2=new OutLook ();
    ob2.start();
	}

}