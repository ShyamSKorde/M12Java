package com.java.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL4 extends Thread
{
	static CopyOnWriteArrayList I = new CopyOnWriteArrayList(); //not get ConcurrentModificationException  
	 //static ArrayList I = new ArrayList(); //get ConcurrentModificationException
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Child thread updating List...");
		I.add("C");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		I.add("A");
		I.add("B");
		CopyOnWriteAL4 t = new CopyOnWriteAL4();
		t.start();
		Iterator itr = I.iterator();
		while(itr.hasNext())
		{
			String i = (String)itr.next();
			System.out.println("main thread iterating List and current entry is : " +i);
			Thread.sleep(3000);
		}
		System.out.println(I);
	}

}
