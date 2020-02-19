 package com.lti.hr.core.service;

import java.util.ArrayList;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

public interface UserRegisterService {

	public boolean insertNewUser(UserRegister user) throws HrException;
	public ArrayList<UserRegister> fetch() throws HrException;
}
