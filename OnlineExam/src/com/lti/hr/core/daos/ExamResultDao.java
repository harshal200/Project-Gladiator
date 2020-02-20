package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.ExamResult;
import com.lti.hr.core.entities.Question;
import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

public interface ExamResultDao {
	public boolean insertExamResult(ExamResult examResult) throws HrException;
	public ArrayList<ExamResult> fetchQuestions() throws HrException;

}
