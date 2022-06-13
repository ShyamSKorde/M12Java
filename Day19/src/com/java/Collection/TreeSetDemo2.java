package com.java.Collection;

import java.util.TreeSet;

public class TreeSetDemo2 
{

	public static void main(String[] args) 
	{
		/*TreeSet t = new TreeSet(); //internally JVM call compareTo() method will inserting 
		t.add("A".compareTo("Z"));//-V
		t.add("Z".compareTo("B"));//+v
		t.add("A".compareTo("A"));//0
		//t.add("A".compareTo(null));//nullPointerException
		System.out.println(t);*/
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();//default Natural Sorting order 
		t.add("B");
		t.add("Z");//("Z" CompareTo("B")); +V after
		t.add("A");//("A" CompareTo("B")); -V before
        System.out.println(t);//[A,B,Z]
	}

}
