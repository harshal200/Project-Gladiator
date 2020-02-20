package com.lti.hr.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.entities.UserResponse;
import com.lti.hr.core.exception.HrException;

@Repository
public class UserResponseDaoImpl implements UserResponseDao{
	
	@PersistenceContext
	private EntityManager manager;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertNewUserResponse(UserResponse userResponse) throws HrException {
		System.out.println("Data reached dao: " + userResponse);
//		manager.merge(user);
		manager.persist(userResponse);
		return true;
	}
	
}
