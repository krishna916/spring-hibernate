package me.krishnamurti.springhibernate.dao;

import java.util.Set;

import me.krishnamurti.springhibernate.model.Department;


public interface DepartmentDao {
	Set<Department> findAll();
	
	Department findById(Long Id);
}
