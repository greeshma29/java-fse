package com.project.pixogram.users.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.pixogram.users.entity.Users;
import com.project.pixogram.users.repository.UsersRepository;

public class UsersServiceImpl implements IUsersService{

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users findUsersById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Users> record =  this.usersRepository.findById(id);
		Users users = new Users();
		if(record.isPresent())
		users = record.get();
		return users;
	}

	@Override
	public boolean addUsers(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUsers(Users users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUsers(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
