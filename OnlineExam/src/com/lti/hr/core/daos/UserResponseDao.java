package com.lti.hr.core.daos;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.entities.UserResponse;
import com.lti.hr.core.exception.HrException;

public interface UserResponseDao {
	
	public boolean insertNewUserResponse(UserResponse userResponse) throws HrException;
}
