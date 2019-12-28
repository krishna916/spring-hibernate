package me.krishnamurti.springhibernate.service;

import java.util.Set;

import me.krishnamurti.springhibernate.model.Role;


public interface RoleService {
	
	Set<Role> findAll();
}
