                   /* Linkhed List */

package com.java.Collection;
                 
import java.util.LinkedList;

public class LinkhedListCollection
{
	public static void main(String[] args)
	{
		LinkedList<String> Name = new LinkedList<String>();
		Name.add("Shyam");
		Name.add("Mayur");
		Name.add("Sumesh");
		Name.add("Shubham");
		Name.add("Vaibhav");
		Name.add("Saurabh");
		Name.add("Prashant");
		System.out.println(" Print Linkhed List is " + "\n " +Name);
		Name.addFirst("Soyeb");//stored begining 
		Name.add("Pooja");//add normal and ending added  
		Name.addLast("Manali");//stored Last 
		Name.add(3, "Priyanka");//stored middle 
		System.out.println("for each loop Start............");
		for(String str : Name)//for eachj loop hold on multiple values Name--> str than print 
		{
			System.out.println( str);
		}
		//Name.remove();//remove (begining) frist by default nature remove frist element in linkhed list.
		Name.removeFirst();//remove First element
		System.out.println(" remove element List is " + "\n " +Name);
		Name.removeLast();//remove last element 
		System.out.println(" remove element List is " + "\n " +Name);
		Name.remove(4);//remove middle than provide index number 
		System.out.println(" remove element List is " + "\n " +Name);

	}

}
/* LinkedList<> :-  stored the element in linked list form and stored on doubly Linked list 
 * addFrist() :-  Inserts the specified element at the beginning of this doubly Linked list.
 * addLast() :-   Inserts the specified element at the beginning of this doubly Linked list.
 * (add():- normaly element add, added ArrayList type and add last but work on linked List than used addLast() & addFrist()).
 * (remove():- normally used remove() in LinkhedList to remove the element of first by defult nature begining remove (Retrieves and removes the head (first element) of this list`))
 * RemoveFrist():- Removes the first element from this list.
 * removeLast():- Removes the Last element from this list.
 * Different ArrayList & LinkedList :- in ArrayList stored the element in Array form and in LinkedList stored the element in LinkhedList form */
 