                /* LinkedHashSet */

package com.java.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass
{

	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		System.out.println(lhs.size());
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs.add("Z"));//true
		System.out.println(lhs.add("C"));//false not allowed dublicate 
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println("trying to reemove null : " +lhs.remove(null));
		System.out.println(lhs.size());
		System.out.println("trying to reemove F is not present : " +lhs.remove("F"));
		System.out.println("checking ia B is present : " +lhs.contains("B"));
		System.out.println("checking ia F is present : "  +lhs.contains("F"));
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(10);
		lhs1.add("G");
		lhs1.add("R");
		lhs1.add("xyz");
		lhs1.add("Q");
		System.out.println(lhs1);
		Iterator I = lhs1.iterator(); // iterate one by one
		while(I.hasNext())
		{
			System.out.println(I.next());
		}
		lhs1.addAll(lhs);
		System.out.println(lhs1);
		lhs.clear();
		System.out.println(lhs);
		System.out.println(lhs.size());
	}

}
/* LinkedHashSet :- Dublicate not allowed, insertion order must preserved (Same order save)*/