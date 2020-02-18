package com.lti.hr.core.service;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

public interface UserRegisterService {

	public boolean addUserToTable(UserRegister user) throws HrException;
}
