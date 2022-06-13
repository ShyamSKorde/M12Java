package com.tns.placement.client;

import com.tns.placement.entities.User;
import com.tns.placement.service.IUserService;
import com.tns.placement.service.UserServiceImpl;

public class Client 
{

	public static void main(String[] args) 
	{
		User user = new User();
		
		IUserService service = new UserServiceImpl();
         
         //create operation 
		user.setId(104);
		user.setName("Shyam");
		user.setPassword(null);
	    user.setType("Teacher");
		service.addNewUser(user);
	    System.out.println("Add data Successfully......");
	    
		/*
		//retrive operation
		user = service.searchUserByID(102);
		System.out.println("id is :" +user.getId());
		System.out.println("name is :" +user.getName());
		System.out.println("type is :" +user.getType());
		System.out.println("retrieve data is sucessfully.....");
		*/
	    
		/*
	    //update operation
	    user = service.searchUserByID(101);
		user.setType("PO");   
		service.updateUser(user);
		System.out.println("data is update sucessfully.....");
		*/
		
		/*
		 // Delete operation 
		user = service.searchUserByID(104);
		service.deleteUser(user);
		System.out.println("data is delete sucessfully......" );
	     */
	    
	    
	}

}


/*
id	name	type	password
101	Shyam	Student	
102	Ram	Teacher	

*/