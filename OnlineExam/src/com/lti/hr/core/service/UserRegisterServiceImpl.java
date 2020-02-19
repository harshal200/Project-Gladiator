package com.lti.hr.core.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.daos.UserRegisterDao;
import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

@Service
public class UserRegisterServiceImpl implements UserRegisterService{
	
	@Autowired
	private UserRegisterDao dao;

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean insertNewUser(UserRegister user) throws HrException {
		
		return dao.insertNewUser(user);
	}

	@Override
	public ArrayList<UserRegister> fetch() throws HrException {
		return dao.fetch();
	}


}
