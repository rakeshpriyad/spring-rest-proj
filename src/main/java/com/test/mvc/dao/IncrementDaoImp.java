package com.test.mvc.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("deprecation")
@Repository
public class IncrementDaoImp implements IncrementDao {

	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings({ "rawtypes"})
	public void increment() {
		Session session = sessionFactory.getCurrentSession();
		String sql = "update number set counter = counter + 1";
		SQLQuery query = session.createSQLQuery(sql);
		query.executeUpdate();
	}
}
