package me.krishnamurti.springhibernate.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import me.krishnamurti.springhibernate.model.Department;
import me.krishnamurti.springhibernate.model.Role;


@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public Set<Department> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Department> departments = session.createQuery("from Department order by departmentName", Department.class)
				.getResultList();
		return new HashSet<>(departments);
	}


	@Override
	public Department findById(Long id) {
		Session session = sessionFactory.getCurrentSession();
	
		return session.find(Department.class, id);
	}
}
