package com.springmvc.dao;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.User;

@Repository
public class UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		int save = (Integer)this.hibernateTemplate.save(user);
		return save;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
