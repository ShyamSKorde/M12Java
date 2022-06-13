package com.java.Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo
{
	public static void main(String []args)
	{
		SortedSet t = new TreeSet();
		//adding element using add() method 
		t.add("India"); 
		t.add("Australia");
		t.add("South Afrika");
		t.add("India");//add dublicate 
		System.out.println(t);
		t.remove("Australia");
		System.out.println(" after removing elements : " +t);
		System.out.println("Iterating Element");
		Iterator i = t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
