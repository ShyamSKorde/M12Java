package com.tnsif.onetone.entites;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args)
	{
       EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-PU");
       EntityManager em=fac.createEntityManager();
       em.getTransaction().begin();

       Student stud=new Student();
       stud.setSname("Gajanan");
       Address add=new Address();
       add.setDno(143);
       add.setStreet("Hanuman Mandir road ");
       add.setCity("M.Pir");
       add.setPincode(444409);
       
       stud.setSaddress_id(add);
       
       em.persist(stud);
       System.out.println("inserted");
       em.getTransaction().commit();
       
       em.close();
       fac.close();
	}

}
