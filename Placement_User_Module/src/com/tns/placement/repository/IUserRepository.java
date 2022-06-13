package com.tns.placement.repository;


import com.tns.placement.entities.User;

public interface IUserRepository
{
	public User addNewUser(User user);
	public User updateNewUser(User user);
	public User searchUserByID(int id);
	public User deleteUser(User user);
	public User deleteUser(int id);
	
	public abstract void beginTransaction();

	public abstract void commitTrasaction();

}
