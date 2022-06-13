package com.tns.placement.service;

import com.tns.placement.entities.User;
import com.tns.placement.repository.IUserRepository;
import com.tns.placement.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService
{
	private IUserRepository dao;
	
	
    
	public UserServiceImpl()
	{
		dao = new UserRepositoryImpl();
	}

	@Override
	public User addNewUser(User user) 
	{
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTrasaction();
		return user;	
	}

	@Override
	public User updateUser(User user) 
	{
		dao.beginTransaction();
		dao.updateNewUser(user);
		dao.commitTrasaction();
		return user;
	}
	
	@Override
	public User searchUserByID(int id)
	{
		User user = dao.searchUserByID(id);
		return user;
	}
    
	@Override
	public User deleteUser(int id) 
	{
		User user = dao.deleteUser(id);
		return user;
	}
	
	@Override
	public User deleteUser(User user)
	{
		dao.beginTransaction();
		dao.deleteUser(user);
		dao.commitTrasaction();
		return user;
	}
	
	@Override
	public User loginUser(User user) 
	{
		
		return null;
	}

	@Override
	public boolean logoutUser(User user)
	{
		
		return false;
	}




}
