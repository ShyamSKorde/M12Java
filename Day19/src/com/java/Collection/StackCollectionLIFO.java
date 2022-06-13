package com.java.Collection;
                 /* Stack LIFO(Last in First Out) */
import java.util.Stack;

public class StackCollectionLIFO 
{

	public static void main(String[] args)
	{
		Stack<String> NAME = new Stack<String>();//	Stack<String> NAME = new Stack<>(); its work (Queue) LIFO operation 
		NAME.add("Shyam");
		NAME.push("Manali");
		NAME.addElement("Mayur");
		NAME.push("Shubham");//push is add element on stack last is special method 
		NAME.push("Prashant");
		NAME.push("Shubhangi");
		NAME.push("Soyeb");
		NAME.push("Saurabh");
		NAME.push("Kavita");
		NAME.push("Vaibhav");
		NAME.push("Sumesh");
		NAME.push("Pooja");
		NAME.push("Priyanka");
		System.out.println(NAME);
		NAME.pop();//delete element on top (LIFO)
		System.out.println(NAME);//
		
	}

}
/* add() :- add() method added the element on stack Memory but stack in special method.so add() not used. 
 * push():- Pushes an item onto the top of this stack.item to be pushed onto this stack.
 * pop():- remove the item top of the stack. last add remove  */
 