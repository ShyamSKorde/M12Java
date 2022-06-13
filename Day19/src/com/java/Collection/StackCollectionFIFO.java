                  /* Stack FIFO(First in First Out) */
package com.java.Collection;
import java.util.ArrayDeque;
public class StackCollectionFIFO 
{
	public static void main(String[] args) 
	{
		ArrayDeque<String> name1 = new ArrayDeque<String>();//ArrayDeque<String> name1 = new ArrayDeque<>();//FIFO
		name1.add("Shyam");
		name1.add("Manali");
		name1.add("Mayur");
		name1.add("Shubham");
		name1.add("Prashant");
		name1.add("Shubhangi");
		name1.add("Vaibhav");
		name1.add("Sumesh");
		name1.add("Pooja");
		name1.add("Priyanka");
		System.out.println(name1);
		//name1.pop();//delete element on top (pop LIFO)
		//name1.push("gdh");//add elemenyt (LIFO) 
		name1.remove();//first remove 
		System.out.println(name1);
		
		

	}

}
/* ArrayDeque :- 
 * add():- AerrayDeque FIFO operatin add(); method is used than add last element
 * remove():- remove element first
   push():- add element 
   pop() :- remove element. 
   in ArrayDeque used add() or remove() method push and pop is specially stack method */ 