                     /* HashSet */

package com.java.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		System.out.println(hs.size());
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add(null);
		hs.add(10);
		System.out.println(hs.add("Z"));//true
		System.out.println(hs.add("C"));//false not allowed dublicate 
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.remove(null));
		System.out.println(hs.size());
		System.out.println("trying to reemove F is not present : " +hs.remove("F"));
		System.out.println("checking ia B is present : " +hs.contains("B"));
		System.out.println("checking ia F is present : "  +hs.contains("F"));
		Iterator i = hs.iterator(); // iterate one by one
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add("G");
		hs1.add("R");
		hs1.add("xyz");
		hs1.add("Q");
		System.out.println(hs1);
		hs1.addAll(hs);
		System.out.println(hs1);
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.size());
		

	}
}
/* HashSet :- order not important , Duplicate are not allowed is used hash set */