                   /* Array List */

package com.java.Collection;
import java.util.ArrayList;
public class ArraylistDemo1 {

	public static void main(String[] args)
	{
		
	ArrayList<String> al=new ArrayList<String>();
	al.add("Mayur");
	al.add("Ravi");
	al.add("Soyeb");
	al.add("Saurabh");
	
	System.out.println(" ArrayList " +al);
	
	al.set(1, "Sumesh");
	System.out.println(" Replace Element " +al);
	
	al.add(2,"Shubham");
	System.out.println("Add Element " +al);
	
	al.remove(3);
	System.out.println(" Remove " +al);
	
	System.out.println("get one by one elements (value) than used for loop, for each loop, while loop,");
	
	System.out.println("forloop");
	for(int i=0;i<al.size();i++)//String used Size() how many times loop should run;
	{
		System.out.println(al.get(i));//get the element 
	} 
	
	System.out.println("Advance for each loop");
	for(String str:al)
	{
		System.out.println(str);
	}
	
	System.out.println ("while loop");
	int count=0;
	while(al.size()>count)
	{
		System.out.println(al.get(count));
		count++;
	}
  }
}