    /* addAllAbsent(Collection c) the elemenyts of collection will be added to the list 
     * if Element are absent and returns number of element Added 
     * */

package com.java.concurrentcollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL2 
{
	public static void main (String[]args)
	{
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println("Array List " +l); //[A, B]
		
		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
		l1.add("A");
		l1.add("C");
		System.out.println("Copy On Write Array List " +l1); //[A, C]
		l1.addAll(l);
		System.out.println("addAll Method" +l1);  //[A, C, A, B]
		
		ArrayList l2 = new ArrayList();
		l2.add("A");
		l2.add("D");
		l2.add("B");
		l2.add("E");
		System.out.println("Array List " +l2); //[A, D]
		l1.addAllAbsent(l2);
		System.out.println("addAllAbsent Method " +l1); //[A, C, A, B, D, E]
		
		
		
	}

}
