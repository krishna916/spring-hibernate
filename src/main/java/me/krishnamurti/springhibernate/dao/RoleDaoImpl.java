package me.krishnamurti.springhibernate.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springhibernate.model.Role;

@Repository
public class RoleDaoImpl implements RoleDao {

	@Autowired
	private SessionFactory SessionFactory;
	
	
	public Set<Role> findAll() {
		Session session = SessionFactory.getCurrentSession();
		
		List<Role> roles = session.createQuery("from Role order by role", Role.class).getResultList();
		return new HashSet<Role>(roles);
	}


	@Override
	public Set<Role> findByIds(String[] ids) {
		List<Long> longIds = Arrays.asList(ids).stream().map(Long::parseLong).collect(Collectors.toList());  
		Session session = SessionFactory.getCurrentSession();
		List<Role> roles = session.createQuery("from Role r where r.id in (:ids) order by role", Role.class)
				.setParameter("ids", longIds)
				.getResultList();
		return new HashSet<Role>(roles);
	}
	
	
	
	
}
