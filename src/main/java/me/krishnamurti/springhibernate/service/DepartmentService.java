package me.krishnamurti.springhibernate.service;

import java.util.Set;

import me.krishnamurti.springhibernate.model.Department;


public interface DepartmentService {
	
	Set<Department> findAll();
	
	
}
