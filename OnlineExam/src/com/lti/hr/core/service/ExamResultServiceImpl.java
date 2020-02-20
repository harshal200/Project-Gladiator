package com.lti.hr.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.daos.ExamResultDao;
import com.lti.hr.core.daos.UserResponseDao;
import com.lti.hr.core.entities.ExamResult;
import com.lti.hr.core.entities.UserResponse;
import com.lti.hr.core.exception.HrException;

@Service
public class ExamResultServiceImpl implements ExamResultService {
	
	@Autowired
	private ExamResultDao dao;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean insertExamResult(ExamResult examResult) throws HrException {
		
		return dao.insertExamResult(examResult);
	}

}
