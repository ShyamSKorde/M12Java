package com.tnsif.singleinh;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInheritance {

	public static void main(String[] args)
	{ 
    EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-PU");
    EntityManager em=fac.createEntityManager();
    em.getTransaction().begin();
    
    EMP emp=new EMP();
    emp.setEmpname("Jayant");
    emp.setSalary(70000);
    em.persist(emp);
    
    Manager mgr=new Manager();
    mgr.setEmpname("Sanjay");
    mgr.setSalary(80000);
                             // name ane Salary and id should be auto incremented 
    mgr.setDeptname("HR");
    em.persist(mgr);
    
    em.getTransaction().commit();
    
    System.out.println("added one emp and mgr");
    
    em.close();
    fac.close();
	}

}
