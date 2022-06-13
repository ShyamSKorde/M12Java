package com.java.concurrentcollection;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL6 
{

	public static void main(String[] args) 
	{
		CopyOnWriteArrayList i = new CopyOnWriteArrayList(); // not get ConcurrentModificationException
		//ArrayList i = new ArrayList(); //get ConcurrentModificationException
		i.add("A");
		i.add("B");
		i.add("C");
		System.out.println("Copy On Write Array List " +i);
		Iterator itr = i.iterator();
		i.add("D");
		while (itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println(s);
		}

	}

}
