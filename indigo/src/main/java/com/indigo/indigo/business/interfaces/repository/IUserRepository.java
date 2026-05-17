package com.indigo.indigo.business.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indigo.indigo.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
