package com.tnsif.collection;

import java.util.ArrayList;

public class GenericsV
{

	public static void main(String[] args)
	{
		ArrayList l =  new ArrayList(); // non generics version
		l.add(10);
		l.add("Abs");
		System.out.println("Non generics vesrion & Not Type safe & not perform Type casting " +l);
		
		
		ArrayList<String> l1 = new  ArrayList<String>(); //generics version
		//ArrayList<String> l = new ArrayList();
		l1.add("Abc");
		//l3.add(10);//type safe
		System.out.println("generics vesrion & Type safe & not perform Type casting " +l1);
		
		ArrayList l3 = new ArrayList<String>();
		l3.add("Abc");
		l3.add(10);//type safe
		l3.add(38.77);
		System.out.println(l3);
		
	}

}
