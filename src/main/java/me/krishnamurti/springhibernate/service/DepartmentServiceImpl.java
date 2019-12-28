package me.krishnamurti.springhibernate.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.krishnamurti.springhibernate.dao.DepartmentDao;
import me.krishnamurti.springhibernate.model.Department;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Transactional
	public Set<Department> findAll() {
		return departmentDao.findAll();
	}


	

}
