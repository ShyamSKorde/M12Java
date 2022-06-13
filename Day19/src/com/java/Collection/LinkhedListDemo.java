               /* Linkhed List */
package com.java.Collection;
import java.util.LinkedList;

public class LinkhedListDemo
{

	public static void main(String[] args) 
	{
		LinkedList L1 = new LinkedList();
		L1.add(null);//Array List method
		L1.add(10);
		L1.add(0,48);
		L1.add("Shyam");
		L1.add(null);
		L1.addFirst("Pune");
		L1.addLast("YD");
		L1.add(4,99);
		System.out.println(L1);
		System.out.println(L1.getFirst());
		System.out.println(L1.getLast());
	    //L1.remove(6);
		//L1.remove(null);
		L1.removeFirst();
		L1.removeLast();
		System.out.println(L1);
		L1.clone();//Returns a shallow copy of this LinkedList.
		System.out.println(L1);
		System.out.println(L1.get(4));
		L1.set(2, 666);
		System.out.println(L1.isEmpty());
		System.out.println(L1.size());
		System.out.println(L1);
		
		// TODO Auto-generated method stub

	}

}
/* Note :- Linkhed list class has all of the same methods as the ArrayList class because they Both the implements the List Interface
 *  */