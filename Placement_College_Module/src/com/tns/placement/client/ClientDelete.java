package com.tns.placement.client;

import com.tns.placement.entities.College;
import com.tns.placement.service.CollegeServiceImpl;
import com.tns.placement.service.ICollegeService;

public class ClientDelete 
{

	public static void main(String[] args)
	{
		College college = new College();
		
		ICollegeService service = new  CollegeServiceImpl();
		
		
		college = service.searchCollege(105);
		service.deleteCollege(college);
		System.out.println("data is delete sucessfully......");
		/*
		college = service.searchCollege(105);
		service.deleteCollege(105);
		System.out.println("data is delete sucessfully......");
		// TODO Auto-generated method stub
         */
	}

}
