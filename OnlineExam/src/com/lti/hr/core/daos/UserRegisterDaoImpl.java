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
	private EntityManager manager;

	

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertNewUser(UserRegister user) throws HrException {
		System.out.println("Data reached dao: " + user);
//		manager.merge(user);
		manager.persist(user);
		return true;
	}

	@Override
	public ArrayList<UserRegister> fetch() throws HrException {
		String strqry="from ureg";
		Query qry=manager.createQuery(strqry);
		//Query qry = manager.createQuery("from ureg");
		List<UserRegister> lst=qry.getResultList();
		return  (ArrayList<UserRegister>) lst;
	}
	

}
