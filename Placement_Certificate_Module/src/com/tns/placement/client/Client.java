        /* Certificate Module Project */


package com.tns.placement.client;

import com.tns.placement.entities.Certificate;

import com.tns.placement.service.CertificateServiceImpl;
import com.tns.placement.service.ICertificateService;

public class Client 
{
	public static void main(String []args) 
	{
		Certificate certificate = new Certificate();
		
		ICertificateService  service = new CertificateServiceImpl();
	    
		//CRUD
		//Create Operation 
		certificate.setId(101);
		certificate.setYear(2017);
		certificate.setCollege("Shivaji College Akola");
		service.addCertificate(certificate);
		System.out.println("data is added successfully......");
		
		/*
		//Retrieve - retrieve the data from database (search) 
		
	    certificate = service.searchCertificate(103);
		System.out.println("ID is :" +certificate.getId());
		System.out.println("Year is :" +certificate.getYear());
		System.out.println("College is :" +certificate.getCollege());
		System.out.println("retrieve data is sucessfully.....");
		*/
		
		
		/*
		// update :- update the data from database 
		certificate = service.searchCertificate(100);
		certificate.setCollege("S.M.C.College Risod");  
		service.updateCertificate(certificate);
		System.out.println("data is update sucessfully.....");
		*/
		
		
		/*
		certificate = service.searchCertificate(103);
		service.deleteCertificate(certificate);
		System.out.println("Delete Data Sucessfully.....");
		*/
	}
	
	
	
}
