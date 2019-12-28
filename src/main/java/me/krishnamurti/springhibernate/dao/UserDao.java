package me.krishnamurti.springhibernate.dao;

import java.util.Set;

import me.krishnamurti.springhibernate.model.User;

public interface UserDao {
	void save(User user);
	
	Set<User> findAll();
	
	void deleteById(Long id);
}
