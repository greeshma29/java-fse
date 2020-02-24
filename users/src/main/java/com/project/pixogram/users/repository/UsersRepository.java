package com.project.pixogram.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pixogram.users.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
