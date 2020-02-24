package com.project.pixogram.users.service;

import java.util.List;

import com.project.pixogram.users.entity.Users;


public interface IUsersService {

	List<Users> findAllUsers();
	Users findUsersById(Integer id);
	boolean addUsers(Users users);
	boolean updateUsers(Users users);
	boolean deleteUsers(Integer id);
}
