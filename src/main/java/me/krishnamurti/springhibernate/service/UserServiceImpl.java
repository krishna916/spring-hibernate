package me.krishnamurti.springhibernate.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import me.krishnamurti.springhibernate.dao.DepartmentDao;
import me.krishnamurti.springhibernate.dao.RoleDao;
import me.krishnamurti.springhibernate.dao.UserDao;
import me.krishnamurti.springhibernate.model.User;

@Repository
public class UserServiceImpl implements UserService{

	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public void save(User user) {
		
		user.setRoles(roleDao.findByIds(user.getRoleIds()));
		user.setDepartment(departmentDao.findById(user.getDepartment().getId()));
		userDao.save(user);
	}

	@Override
	@Transactional
	public Set<User> findAll() {
		return userDao.findAll();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		userDao.deleteById(id);
	}

}
