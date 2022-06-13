                  /* Vector Demo*/
package com.java.Collection;
//import java.util.*;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector(); //create object vector class default size is 10
		System.out.println(v.capacity());
		v.add(null);
		v.add(null);
		v.add("Tanushri");
		v.add("Mayuri");
		v.add("Ganesh");// normal ArryList
		v.add("Kalpna");
		v.add("Santosh");
		v.add("Raut");
		v.add(0,"Shyam");
		v.addElement("Vijay");//vector method add the element in the list (10 version)
		System.out.println(v);
		System.out.println(" remove elements " +v.removeElement(null));
		System.out.println(v);
		v.remove(0);//remove (index int);//normal methods
		v.removeElement("Vijay");//removeElement(object o); vector method 
		
		
		
		Vector V = new Vector();
		V.add("Manthan");
		V.add("Vansh");
		V.add("Varsha");
		V.add("Gajjanan");
		V.add("Chavan");
		System.out.println(V);
		System.out.println(" Vector Size  is :- " +V.size());//size means current how many object is their 
		//V.firstElement();
		System.out.println(" Accessing First Element is :- " +V.firstElement());
		System.out.println(" Accessing Last Element is :- " +V.lastElement());
		System.out.println(" Accessing Element using get mehtod is  :- " +V.get(3));
		System.out.println("     jhfjvdlkdwbshcvnnm,s " +V.elementAt(4));
		V.addAll(v);
		V.clear();
		System.out.println(V);
		System.out.println(" combination :- " +V);
		
		
		Vector S = new Vector(20);//initial capacity
		for(int i=0;i<=25;i++)
		{
			S.addElement(i);
		}
		System.out.println(S.capacity());// total how many object instert 
		System.out.println(S);
		System.out.println(S.hashCode());// returns the hash code value of the vector 
		
		
		Vector T = new Vector(5,2);//Initial Capacity & Incremental Capacity
		System.out.println(" initial size is " +T.size());
		System.out.println(" initial capacity is " +T.capacity());
		T.add(1);
		T.add(2);
		T.add(3);
		T.add(4);
		T.addElement(5);//
		T.addElement(new Integer (1)); // the constructor Integer(int) has been deprecated since version 9 and marked for removal
		System.out.println("capacity after elements adding " +T.capacity());
        T.add(6);
        System.out.println("Current capacity after elements adding " +T.capacity());
        System.out.println(T);
        Vector I = new Vector(T);
        System.out.println("Create collection object " +I);
	}

}
