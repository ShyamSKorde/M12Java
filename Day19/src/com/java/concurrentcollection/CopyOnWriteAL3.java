package com.java.concurrentcollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL3 
{

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println("Array List l add method " +l); //[A, B]
		
		CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
		l1.addIfAbsent("A");
		l1.addIfAbsent("C");
		System.out.println("Copy On Write Array List addIfAbsent method " +l1); //[A, C]
		
		l1.addAll(l);
		System.out.println("addAll Method " +l1); //[A, C, A, B]
		
		
		ArrayList l2 = new ArrayList();
		l2.add("A");
		l2.add("E");
		System.out.println("Array List l2 add Method " +l2); //[A, E]
		l1.addAllAbsent(l2); //if element is absent than add otherwise ignore 
		System.out.println("addAllAbsent Method " +l1); //[A, C, A, B, E]
       
		
		// TODO Auto-generated method stub

	}

}
