                   /* TreeSet */
package com.java.Collection;

import java.util.TreeSet;

public class TreeSetClass 
{
	public static void main(String[]args)
	{
		TreeSet ts = new TreeSet();//empty natural sorting order 
		ts.add("A");//A->65
		ts.add("a");//a->97
		ts.add("B");
		ts.add("Z");
		ts.add("L");
		ts.add("V");
		//ts.add(new Integer(10));//ClassCastException // hetrogeneous not allowe its integer so ccexception and dapricated method 
		//ts.add(null);// non-empty tree set not allow null value try we will gwt NullPointerException
		System.out.println(ts);
	}

}
/* Sorted Set :- not dublicate but some sorting order  (not matter insertion order preserved or not)
 * TreeSet :- no Dublicate, No insertion order but some sorting order, heterogeneous object are not allowed  */ 
 