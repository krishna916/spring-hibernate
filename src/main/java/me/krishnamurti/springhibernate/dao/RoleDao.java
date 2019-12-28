package me.krishnamurti.springhibernate.dao;

import java.util.Set;

import me.krishnamurti.springhibernate.model.Role;

public interface RoleDao {
	
	Set<Role> findAll();
	
	Set<Role> findByIds(String[] ids);
}
