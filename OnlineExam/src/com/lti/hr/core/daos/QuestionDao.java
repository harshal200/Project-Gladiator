package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.Question;
import com.lti.hr.core.exception.HrException;

public interface QuestionDao {

	public ArrayList<Question> fetchQuestions() throws HrException;
}
