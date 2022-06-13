package com.java.Collection;
                   /* ArrayList */
import java.util.ArrayList;

public class ArrayListCollection
{
	public static void main(String[] args) 
	{
		ArrayList<String> name = new ArrayList<String>();//create object and its pre-define class in java  
		name.add("Shyam");
		name.add("Mayur");
		name.add("Sumesh");
		name.add("Shubham");
		name.add("Vaibhav");
		name.add("Saurabh");
		name.add("Xyz");
		name.add("Prashant");
		System.out.println(" Print Array List is " + "\n " +name);
		name.add("soyeb"); // more element add 
		System.out.println(" Print Array List is " + "\n " +name);
		name.add(0,"Pooja");// add begining 0:- index no & Pooja :- element is added(value)
		System.out.println(" Print Array List is " + "\n " +name);
		name.add(4,"Priyanka");// add last 4:- index no & Priyanka :- element is added(value)
		System.out.println(" Print Array List is " + "\n " +name);
		name.remove(5);//remove element index no 5
		System.out.println(" Print Array List is " + "\n " +name);
		name.set(6,"Manali");//replace pqr->Ajit
		System.out.println(" Print Array List is " + "\n " +name);
		System.out.println(" Print Array List is " + "\n " +name.get(4));// return 4 position
		name.clear();//clear all and return empty
		System.out.println(" Print Array List is " + "\n " +name);
	}

}
/* ArrayList<String> name = new ArrayList<String>(): :- create ArrayList Class object, String is which type value to be stored, name is variable name, avaliable in import java.util.ArrayList; package  
 * add(); :- add() is predefine method in ArrayList class and used to insert the element in ArrayList, add last generate Memory  
 * add(begining -IndexNo,Value) :- add begining 0 is index no and start with 0 Sumedh is element (Value) to added
 * add(middle-IndexNo,Value) :- add midle in 4 position and index no is change
 * remove() :-  Removes the element at the specified position in this ArrayList list, Parameters:index the index of the element to be removed, Returns:the element that was removed from the list(remove the element and provide index no or variable name)
 * set() :- Replaces the element at the specified position in this ArrayList list withthe specified element
 * ger() :- Returns the particular element at the specified position in this ArrayList list 
 * clear() :- Removes all of the elements from this Arraylist list. The ArrayList list willbe empty after this call returns. */
