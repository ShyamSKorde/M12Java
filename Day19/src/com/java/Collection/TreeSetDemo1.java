package com.java.Collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(); 
		t.add("A");
		t.add("Z");
		t.add(37);
		t.add("B");
		System.out.println(t);
		
		// TODO Auto-generated method stub
		/*TreeSet t = new TreeSet();//StringBuffer object insert 
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("L"));//in prigram ClassCastException because not implement comparable interface 
		t.add(new StringBuffer("Z"));
		System.out.println(t);*/
		
	}

}
/* in Default natural sorting order element should be Homogeneous or comperlable otherwise ClassCastException*/