package com.lti.hr.core.daos;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

public interface UserRegisterDao {

	public boolean addUser(UserRegister user) throws HrException;
}
