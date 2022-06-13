                 /* ArrayList Class */
package com.java.Collection;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{	  
		ArrayList AL = new ArrayList();
		AL.add("Rajesh");
		AL.add(345L);
		AL.add("Ravi");
		AL.add('S');
		AL.add("Ravindra");
		AL.add(49);
		AL.add(49.88);
		AL.add("Ramesh");
		AL.add(true);
		AL.add(3456.858D);
		System.out.println(AL.add(100)); // obj add but particular object is add return true, not add return false 
		//System.out.println(AL.Contains(39)); return true value is present otherwise false 
		System.out.println(" Array List AL :- " +AL);//normally print all added array object/elements
		System.out.println(AL.isEmpty()); // check ArrayList is Empty or not and return boolean value 
		
		
		
		ArrayList al = new ArrayList();
		al.add(39);
		al.add('P');
		al.add(0,"Shyam");
		al.add(23.56);
		al.add(399484L);
		al.add(49);
		al.add(false);
		al.add("Mangesh");
		System.out.println(" Array List al :- " +al);
		//al.addAll(AL);// add all object collection Al in al 
		//System.out.println(al);
		System.out.println(al.size());//return size of ArrayList
		//al.remove(39); // IndexOutOfBoundsException becouse index size 
		al.remove(4);//remove element on particular index no 
		al.remove("Shyam");//object is remove its String but intrger not possible 
		System.out.println(al);
		//al.removeAll(al);//al remove returbn[]
		//System.out.println(al);
		//al.removeAll(AL);//remove all AL object elementsvi.e common elements  not al
		//System.out.println(al);	
		//System.out.println(AL);
		//al.clear();//clear all collection obj []
		//System.out.println(al);
		al.set(3,"Ram");//replace object 
		System.out.println(al);
		
		

	}

}
