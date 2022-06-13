package com.tns.placement.service;

import com.tns.placement.entities.User;

public interface IUserService 
{
	public User addNewUser (User user);
	public User updateUser (User user);
	public User searchUserByID(int id);
	public User deleteUser(User user);
	public User deleteUser(int id);
    public User loginUser (User user);
    public boolean logoutUser (User user);
    
}
