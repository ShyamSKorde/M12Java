
               /* need Concurrent Collection  */

package com.java.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Mythread  extends Thread
{
	static ArrayList al = new ArrayList();
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Child Thread updating List");
		al.add("E");   //one thread modifing AL
	}

	public static void main(String[] args) throws InterruptedException
	{
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		Mythread t = new Mythread();
		t.start();
		Iterator itr = al.iterator();	//one thread iterating AL	
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println("Main Thread Iterating List Current Object " +s);
			Thread.sleep(2000);
		}
        System.out.println(al);
	}

}
