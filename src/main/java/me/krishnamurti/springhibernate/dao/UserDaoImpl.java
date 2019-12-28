package me.krishnamurti.springhibernate.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springhibernate.model.User;

@Repository
public class UserDaoImpl implements UserDao{


	@Autowired
	private SessionFactory SessionFactory;
	
	
	@Override
	public void save(User user) {
		Session session = SessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		
	}


	@Override
	public Set<User> findAll() {
		Session session = SessionFactory.getCurrentSession();
		List<User> users = session.createQuery("from User order by firstName", User.class).getResultList();
		return new HashSet<>(users);
	}


	@Override
	public void deleteById(Long id) {
		Session session = SessionFactory.getCurrentSession();
		session.createQuery("delete from User where id =:id").setParameter("id", id).executeUpdate();
	}

}
