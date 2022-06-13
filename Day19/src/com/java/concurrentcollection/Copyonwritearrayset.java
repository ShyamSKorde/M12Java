package com.java.concurrentcollection;

import java.util.concurrent.CopyOnWriteArraySet;

public class Copyonwritearrayset
{

	public static void main(String[] args)
	{
		CopyOnWriteArraySet i = new CopyOnWriteArraySet();
		i.add("A");
		i.add("B");
		i.add(74.4);
		i.add('t');
		i.add(30);
		i.add("A");
		i.add("B");
		i.add(null);
		i.add("D");
		i.add("C");
        System.out.println(i);
	}

}
