package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

@Repository
public class UserRegisterDaoImpl implements UserRegisterDao{

	@PersistenceContext
	private EntityManager manager;

	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean addUser(UserRegister user) throws HrException {
		manager.persist(user);
		return true;
	}


	@Override
	public ArrayList<UserRegister> fetch(UserRegister user) throws HrException {
		
		return null;//Edits to be done;
	}
}
