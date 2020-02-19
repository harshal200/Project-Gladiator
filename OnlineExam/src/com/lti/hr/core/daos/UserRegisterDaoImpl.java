package com.lti.hr.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

@Repository
public class UserRegisterDaoImpl implements UserRegisterDao{

	@PersistenceContext
	EntityManager manager;

	

	@Override
	public ArrayList<UserRegister> fetch() throws HrException {
		String strqry="from ureg";
		Query qry=manager.createQuery(strqry);
		//Query qry = manager.createQuery("from ureg");
		ArrayList<UserRegister> lst=(ArrayList<UserRegister>) qry.getResultList();
		return lst;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertNewUser(UserRegister user) throws HrException {
		System.out.println("Data reached dao: " + user);
//		manager.merge(user);
	manager.persist(user);
		return true;
	}

}
