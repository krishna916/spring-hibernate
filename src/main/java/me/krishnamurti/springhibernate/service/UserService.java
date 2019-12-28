package me.krishnamurti.springhibernate.service;

import java.util.Set;

import me.krishnamurti.springhibernate.model.User;

public interface UserService {
	
	void save(User user);
	
	Set<User> findAll();
	
	void deleteById(Long id);
}
