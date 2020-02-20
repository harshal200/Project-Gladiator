package com.lti.hr.core.service;

import java.util.ArrayList;
import com.lti.hr.core.entities.UserResponse;
import com.lti.hr.core.exception.HrException;

public interface UserResponseService {
	
	public boolean insertNewUserResponse(UserResponse userResponse) throws HrException;
}
