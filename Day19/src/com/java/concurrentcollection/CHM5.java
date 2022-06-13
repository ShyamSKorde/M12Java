package com.java.concurrentcollection;


//import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CHM5 extends Thread 
{
	//static HashMap m1 = new HashMap();  //normal hash map get ConcurrentModificationException
	static ConcurrentHashMap m1 = new ConcurrentHashMap(); // not get ConcurrentModificationException
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Child thread updating Map...");
		m1.put(103, "C");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		m1.put(101, "A");
		m1.put(102, "B");
		CHM5 t = new CHM5();
		t.start();
		Set s =m1.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			System.out.println("main thread iterating map and current entry is :" +i+"....."+m1.get(i));
			Thread.sleep(3000);
		}
		System.out.println(m1);
		
	}
   
}
