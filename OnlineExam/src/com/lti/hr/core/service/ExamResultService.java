package com.lti.hr.core.service;


import com.lti.hr.core.entities.ExamResult;
import com.lti.hr.core.exception.HrException;

public interface ExamResultService {
	
	public boolean insertExamResult(ExamResult examResult) throws HrException;

}
