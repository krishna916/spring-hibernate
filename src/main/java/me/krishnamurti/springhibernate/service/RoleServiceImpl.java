package me.krishnamurti.springhibernate.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.krishnamurti.springhibernate.dao.RoleDao;
import me.krishnamurti.springhibernate.model.Role;


@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Transactional
	public Set<Role> findAll() {
		return roleDao.findAll();
	}

}
