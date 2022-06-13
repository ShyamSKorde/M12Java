package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.User;

public class UserRepositoryImpl implements IUserRepository 
{
	// Start JPA LifeCycle
	
	private EntityManager entityManager;
	
	public UserRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
    
	// CRUD operation 
	
	@Override
	public User addNewUser(User user) 
	{
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateNewUser(User user) 
	{
		entityManager.merge(user);
		return user;
	}
	
	@Override
	public User searchUserByID(int id)
	{
		User user = entityManager.find(User.class, id);
		return user;
	}
	
   
	@Override
	public User deleteUser(int id)
	{
		User user = entityManager.find(User.class , id);
		entityManager.remove(user);
		return user;
	
	}
     
	@Override
	public User deleteUser(User user)
	{
		entityManager.remove(user);   
		return user;
	}
	
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTrasaction() 
	{
		entityManager.getTransaction().commit();
	}


}
