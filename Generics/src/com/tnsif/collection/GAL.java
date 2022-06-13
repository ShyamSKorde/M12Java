package com.tnsif.collection;

import java.util.ArrayList;
import java.util.List;

public class GAL
{

	public static void main(String[] args) 
	{
		//generics version of type sefty 
		ArrayList<String> al=new ArrayList(); //syntex Class <Type>
		al.add("Mayur");
		al.add("Ravi");
		al.add("Soyeb");
		al.add("Saurabh");
		System.out.println(" Generics Type of Array List : ."+ "\n "+al);
		
		
		//not Type Safety
		List list = new ArrayList();  // syntex interface<type>
		list.add(10);
		list.add(20);
		list.add(468.89);
		list.add("abc");
		list.add("789");
		System.out.println("Before generics not Type Safety " +list);
		
		//Type Safety
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(373);
		list1.add(88738);
		//list1.add("4774"); // compile time error
		System.out.println("After generics is Type Safety " +list1);
	}

}
/* The Generics collections disable the type-casting and there is no used of type-casting when it is used in generics
 * its a type-safe and checked at compile time these generics collection allow the datatypes to pass as parameters to classes
 *  1.5 version */
 