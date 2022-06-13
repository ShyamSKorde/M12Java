
   /* boolean addIFAbsent(object o) 
    * :- the element will be added if and only if List Doesn't contain this Element 
    */      

package com.java.concurrentcollection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL1
{

	public static void main(String[] args)
	{
		CopyOnWriteArrayList c = new CopyOnWriteArrayList();
		c.add("A");
		c.add("B");
		c.add("B"); // normal array list  
		System.out.println(" output of normal add method is " +c); // // normal array list [A, B, B]
		c.addIfAbsent("C");
		c.addIfAbsent("D");
		c.addIfAbsent("D");
		System.out.println(" output of normal addIfAbsent method is " +c); // skip duplicate [A, B, B, C, D]
		

	}

}
