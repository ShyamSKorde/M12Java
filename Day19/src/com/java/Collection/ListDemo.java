                       /* Difference Set & List (check methods)*/
package com.java.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo
{

	public static void main(String[] args)
	{
		//List interface 
		List l1 = new ArrayList();//stored the elements on index base,list is interface so not create interface object used implemented class create array list object and pass referance  
		l1.add(null);
		l1.add(10);
		l1.add(20);
		l1.add("Ram");
		l1.add(true);
		l1.add(10);
		l1.add(null);
		l1.add("Ranjit");
		l1.add('s');
		l1.set(4, "Shyam");//replace/change the item 
		l1.add(4, 2999);
		l1.add(20);
		l1.add(null);//add multiple null value
		//System.out.println(l1.indexOf(l1));
		System.out.println(l1);
		l1.remove("Ranjit");//remove the item l1.remove(o,null)
		System.out.println(l1);
		System.out.println(" get elements "+l1.get(5));//access the elements 
		System.out.println(l1.isEmpty());//return list is empty or not return boolean value 
		
		//set Interface 
		Set s = new HashSet();//stored the elements on Hash code base, set is interface so not create interface object used implemented class create HashSet object and pass referance  
		s.add(47);
		s.add(true);
		s.add("Ajay");
		s.add(null);//add only one null value 
		s.add(384.89);
		s.add(47);
		s.add(true);
		s.add(null);//not error not print 
		//s.add(5,"eer");//not index base
		System.out.println(" Hash Code " +s.hashCode());
		System.out.println(s);
		System.out.println(s.add(200));//trur add element
		System.out.println(s);
		System.out.println(s.add(384.89));//false not add element because arleady add 
		System.out.println(s);
		s.remove(47);
		System.out.println(s);
		//s.removeAll(s);//remove all collection 
		s.clear();// return[]
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}
