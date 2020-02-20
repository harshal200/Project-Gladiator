package com.lti.hr.core.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.daos.UserResponseDao;
import com.lti.hr.core.entities.UserResponse;
import com.lti.hr.core.exception.HrException;

@Service
public class UserResponseServiceImpl implements UserResponseService  {

	
	@Autowired
	private UserResponseDao dao;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean insertNewUserResponse(UserResponse userResponse) throws HrException {
		
		return dao.insertNewUserResponse(userResponse);
	}
}
