package com.java.concurrentcollection;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL5 
{

	public static void main(String[] args) 
	{
		CopyOnWriteArrayList i = new CopyOnWriteArrayList(); //not remove get UnsupportedOperationException
		//ArrayList i = new ArrayList(); //remove
		i.add("A");
		i.add("B");
		i.add("C");
		i.add("D");
		System.out.println("Copy On Write Array List " +i);
		Iterator itr = i.iterator();
		while (itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("D"))
			{
				itr.remove();
				//System.out.println(itr);
			}
		}
		System.out.println(i);

	}

}
