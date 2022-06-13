


package com.java.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;


public class Concurrentmap4 
{

	public static void main(String[] args) 
	{
		// ConcurrentMap m = new ConcurrentHashMap();
		ConcurrentHashMap m = new ConcurrentHashMap(); 
		m.put(101, "A");
		m.put(102, "B");
		m.putIfAbsent(103, "c");
		m.putIfAbsent(101, "D");
		m.remove(101,"D");
		m.replace(102, "B" , "E");
		System.out.println(m);

	}

}
