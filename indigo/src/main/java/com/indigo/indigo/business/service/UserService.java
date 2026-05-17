package com.indigo.indigo.business.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.indigo.indigo.business.interfaces.repository.IUserRepository;
import com.indigo.indigo.business.interfaces.service.IUserService;
import com.indigo.indigo.entity.User;

@Service
public class UserService implements IUserService {
	private final IUserRepository repository;

	public UserService(IUserRepository repository) {
		this.repository = repository;
	}

	@Override
	public String getName() {
		Optional<User> user = this.repository.findById(1);
		String name = user.isPresent() ? user.get().getName() : "";
		return name;
	}

}
