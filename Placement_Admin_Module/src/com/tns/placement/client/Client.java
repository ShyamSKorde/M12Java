package com.tns.placement.client;

import java.util.Scanner;

import com.tns.placement.entites.Admin;

public class Client 
{

	public static void main(String[] args) 
	{
		Admin admin = new Admin();
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Name");
	    String name = sc.nextLine();
	    admin.setName(name);
	    
	    System.out.println("Enter ID");
	    int ID = sc.nextInt();
	    admin.setId(ID);
	    
	    System.out.println("Enter Password");
		String Password = sc.next();		
		admin.setPassword(Password);
		
		//sc.close();
		System.out.println("Enter name is : " +admin.getName()); 
		System.out.println("Enyter id is : " +admin.getId()); 
		System.out.println("Enter Password is : " +admin.getPassword());
        
		sc.close();
		
		//String k = sc.nextLine();
	}

}
