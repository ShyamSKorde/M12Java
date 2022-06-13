package com.java.Collection;

import java.util.Stack;

public class StackDemo 
{

	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push("Shyam");
		s.push("Ram");
		s.push("abc");
		s.push("abc");
		s.push("xyz");
		s.push("pqr");
		s.push("lmn");
		s.push("dcm");
		s.push("tya");
		s.pop();//LIFO
	    System.out.println(s.peek()); //Get the top data element of the stack, without removing it.
		System.out.println(s);
		System.out.println(s.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
