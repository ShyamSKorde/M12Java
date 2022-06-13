package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest
{

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");// EntityManagerFactory initiated with persistence life cycle JPA
		EntityManager em = factory.createEntityManager();// persistences 
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("Aayush");
		employee.setSalary(2000);
		em.persist(employee);//persist directly insert the data in to the database  
		
		//create one manager
		Manager manager = new Manager();
		//not set any id because auto geneterated  
		manager.setName("Shreyansh");
		manager.setSalary(7000);
		manager.setDepartmentName("Botany");
		em.persist(manager);
		
		
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}
